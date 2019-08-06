package animals;

// Optional code here
public class NikWolf extends Animal
{
   // Optional code here

   // Available variables:
   // - surroundings    A zero indexed, 3 by 3 matrix of characters that represent nearby animals.
   //                   Empty tiles are represented by a space character (' '). You are at surroundings[1][1].
   //                   For example, to your right would be surroundings[1][2], and above you is surroundings[0][1].
   //                   Your surroundings are updated just before being asked to move,
   //                   but may be out of date when asked to fight.
   public NikWolf()
   {
      // TODO enter your unique letter
      super('N');
      /* Optional code here */
   }

   public Attack fight(char c)
   {
      if(c == 'S')
         return Attack.PAPER;
      if(c == 'B')
         return Attack.SCISSORS;
      if(c == 'L')
         return Attack.SCISSORS;
      return Attack.ROCK;
   }

   public Move move()
   {
      if(leftAlone())
         return Move.HOLD;
      if(lookLeft() != ' ')
         return Move.RIGHT;
      if(lookUp() != ' ')
         return Move.DOWN;
      if(lookRight() != ' ')
         return Move.LEFT;
      if(lookDown() != ' ')
         return Move.UP;
      return  Move.HOLD;
   }

   private boolean leftAlone()
   {
      return lookLeft() == ' ' && lookUp() == ' ' && lookRight() == ' ' && lookDown() == ' ';
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
