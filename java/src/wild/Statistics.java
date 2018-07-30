
package wild;

import java.util.List;

public final class Statistics
{

   private final Game game;
   private final List<Class> classes;
   private final int[] living;

   protected Statistics(Game game, List<Class> classes)
   {
      this.game = game;
      this.classes = classes;
      this.living = new int[classes.size()];
   }

   protected void update()
   {
      for (int i = 0; i < classes.size(); i++)
      {
         living[i] = game.poll(classes.get(i));
         if (living[i] == 0)
         {
            String killedAnimal = classes.get(i).getSimpleName();
            classes.remove(i);
            String stat = "";
            for (int j = 0; j < classes.size(); j++)
            {
               stat += "\t living " + classes.get(j).getSimpleName() + ": " + game.poll(classes.get(j));
            }
            System.out.println( killedAnimal + " is dead: " + stat);
         }
      }


   }

   public String toString()
   {
      String s = "<html>";
      for (int i = 0; i < classes.size(); i++)
      {
         s += classes.get(i) + "&nbsp;-&nbsp;" + living[i] + "<br>";
      }
      return s + "</html>";
   }
}
