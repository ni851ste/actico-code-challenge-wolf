package animals;

public class NikWolf extends Animal
{

   public NikWolf()
   {
      super('N');
   }

   public Attack fight(char c)
   {
      if (c == 'S')
         return Attack.PAPER;
      if (c == 'B')
         return Attack.SCISSORS;
      if (c == 'L')
         return Attack.SCISSORS;
      return Attack.ROCK;
   }

   public Move move()
   {
      if (grouped())
         return Move.RIGHT;

      return randomMove();
   }

   private Move randomMove()
   {
      double randomlyRolledNumber = Math.random();

      if (randomlyRolledNumber < 0.25)
         return Move.LEFT;
      if (randomlyRolledNumber < 0.5)
         return Move.UP;
      if (randomlyRolledNumber < 0.75)
         return Move.RIGHT;
      if (randomlyRolledNumber < 1)
         return Move.DOWN;

      return Move.HOLD;
   }

   private boolean grouped()
   {
      return lookLeft() == 'N' || lookUp() == 'N' || lookRight() == 'N' || lookDown() == 'N';
   }

   private char lookLeft()
   {
      return surroundings[1][0];
   }

   private char lookRight()
   {
      return surroundings[1][2];
   }

   private char lookUp()
   {
      return surroundings[0][1];
   }

   private char lookDown()
   {
      return surroundings[2][1];
   }
}
