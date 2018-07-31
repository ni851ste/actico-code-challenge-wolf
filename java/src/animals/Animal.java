
package animals;

public abstract class Animal
{
   public final char letter;
   public char[][] surroundings;

   public enum Attack
   {
      ROCK,
      PAPER,
      SCISSORS,
      SUICIDE
   }

   public enum Move
   {
      UP,
      RIGHT,
      DOWN,
      LEFT,
      HOLD
   }

   public Animal(char letter)
   {
      this.letter = letter;
   }

   public abstract Attack fight(char c);

   public abstract Move move();


}
