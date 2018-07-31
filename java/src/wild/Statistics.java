
package wild;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public final class Statistics
{

   private final Game game;
   private final List<Class> classes;
   private final Map<Class, Integer> living;
   private final Map<Class, Long> extinct;
   private final long start;

   protected Statistics(Game game, List<Class> classes)
   {
      this.game = game;
      this.classes = classes;
      this.living = new HashMap<>();
      this.extinct = new HashMap<>();
      this.start = System.currentTimeMillis();
   }

   protected void update()
   {
      for (Class currentSpecies : classes)
      {
         living.put(currentSpecies, game.poll(currentSpecies));
         if (living.get(currentSpecies) == 0 && !extinct.containsKey(currentSpecies))
         {

            String killedSpeciesName = currentSpecies.getSimpleName();
            System.out.println(killedSpeciesName + " is extinct: ");
            extinct.put(currentSpecies, System.currentTimeMillis());
            classes.stream()
               .filter(c -> living.get(c) > 0)
               .forEach(c -> System.out.println("\t living " + c.getSimpleName() + ": " + game.poll(c)));
         }
      }

      int livingSpeciesCount = (int) living.entrySet().stream()
         .filter(s -> s.getValue() > 0)
         .count();

      if (livingSpeciesCount == 1)
      {
         Game.running = false;
      }


      if ((System.currentTimeMillis() - start) / 1000 > 120)
      {
         System.out.println("-------------------------------");
         System.out.println("\n\nStatistics after 2 Minutes:");


         List<String> livingSpecies = living.entrySet().stream()
            .filter(s -> s.getValue() > 0)
            .sorted(Map.Entry.<Class, Integer> comparingByValue().reversed())
            .map(s -> s.getKey().getSimpleName() + ": " + s.getValue() + " survivors")
            .collect(Collectors.toList());

         List<String> extinctSpecies = extinct.entrySet().stream()
            .sorted(Map.Entry.<Class, Long> comparingByValue().reversed())
            .map(s -> s.getKey().getSimpleName() + ": " + getLifetime(s.getValue()) + " seconds until extinction")
            .collect(Collectors.toList());

         final List<String> finalStats = new ArrayList<>();
         finalStats.addAll(livingSpecies);
         finalStats.addAll(extinctSpecies);


         finalStats.stream()
            .map(pos -> "#" + (finalStats.indexOf(pos) + 1) + " " + pos)
            .forEach(System.out::println);

         Game.running = false;
      }
   }

   private long getLifetime(long deathAtTimestamp)
   {
      long lifetimeInMillis = deathAtTimestamp - start;
      return lifetimeInMillis / 1000;
   }

   public String toString()
   {
      StringBuilder s = new StringBuilder("<html>");
      for (Class species : classes)
      {
         if (living.get(species) == 0)
         {
            s.append("<strike>").append(species).append("&nbsp;-&nbsp;").append(living.get(species)).append("</strike><br>");
         }
         else
         {
            s.append(species).append("&nbsp;-&nbsp;").append(living.get(species)).append("<br>");
         }
      }
      return s.toString() + "</html>";
   }
}
