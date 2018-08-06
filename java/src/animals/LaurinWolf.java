package animals;

// Optional code here
public class LaurinWolf extends Animal
{
   // Optional code here

   // Available variables:
   // - surroundings    A zero indexed, 3 by 3 matrix of characters that represent nearby animals.
   //                   Empty tiles are represented by a space character (' '). You are at surroundings[1][1].
   //                   For example, to your right would be surroundings[1][2], and above you is surroundings[0][1].
   //                   Your surroundings are updated just before being asked to move,
   //                   but may be out of date when asked to fight.
   public LaurinWolf()
   {
      super('W');
      /* Optional code here */
   }

   public Attack fight(char c)
   {
      /* Required code here. Must return an Attack. */

      switch (c)
      {
         case 'L':
            return Attack.SCISSORS;
         case 'B':
            return Attack.SCISSORS;
         case 'S':
            return Attack.PAPER;
         default:
            return Math.random() > 0.5 ? Attack.PAPER : Attack.ROCK;
      }
   }

   public Move move()
   {
      /* Required code here. Must return a Move. */
      if (lookDown() == 'L')
      {
         return Move.UP;
      }
      else if (lookLeft() == 'L')
      {
         return Move.RIGHT;
      }
      else if (lookRight() == 'L')
      {
         return Move.LEFT;
      }
      else if (lookUp() == 'L')
      {
         return Move.DOWN;
      }
      else
      {
         return Math.random() > 0.5 ? (Math.random() > 0.5 ? Move.DOWN : Move.UP) :
            (Math.random() > 0.5 ? Move.LEFT : Move.RIGHT);
      }
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
      return surroundings[2][1];
   }

   private char lookDown()
   {
      return surroundings[2][1];
   }
}
