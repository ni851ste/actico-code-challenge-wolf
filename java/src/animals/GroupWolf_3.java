package animals;

// Optional code here
public class GroupWolf_3 extends Animal
{
   // Optional code here

   // Available variables:
   // - surroundings    A zero indexed, 3 by 3 matrix of characters that represent nearby animals.
   //                   Empty tiles are represented by a space character (' '). You are at surroundings[1][1].
   //                   For example, to your right would be surroundings[1][2], and above you is surroundings[0][1].
   //                   Your surroundings are updated just before being asked to move,
   //                   but may be out of date when asked to fight.
   public GroupWolf_3()
   {
      // TODO enter your unique letter
      super('3');
      /* Optional code here */
   }

   public Attack fight(char c)
   {
      // TODO implement this method
      switch(c) {
         case 'L':
            return Attack.SCISSORS;
         case 'B':
            return Attack.SCISSORS;
         case 'S':
         case 'N':
         case 'Y':
            return Attack.PAPER;

         default:
            return Math.random() > 0.5 ? Attack.PAPER : Attack.ROCK;
      }

   }

   public Move move()
   {

         /* Required code here. Must return a Move. */
         if (lookDown() == '1')
         {
            return Move.UP;
         }
         else if (lookLeft() == '1')
         {
            return Move.RIGHT;
         }
         else if (lookRight() == '1')
         {
            return Move.LEFT;
         }
         else if (lookUp() == '1')
         {
            return Move.DOWN;
         }

            /* Required code here. Must return a Move. */
            if (lookDown() == '2')
            {
               return Move.UP;
            }
            else if (lookLeft() == '2')
            {
               return Move.RIGHT;
            }
            else if (lookRight() == '2')
            {
               return Move.LEFT;
            }
            else if (lookUp() == '2')
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
      //TODO return the character of the field on the left side
      return ' '; // can be removed for something else
   }

   private char lookRight()
   {
      //TODO return the character of the field on the right side
      return ' '; // can be removed for something else
   }

   private char lookUp()
   {
      //TODO return the character of the field above
      return ' '; // can be removed for something else
   }

   private char lookDown()
   {
      //TODO return the character of the field below
      return ' '; // can be removed for something else
   }
}
