package animals;

// Optional code here
public class MaxWolf extends Animal {
   // Optional code here

   // Available variables:
   // - surroundings    A zero indexed, 3 by 3 matrix of characters that represent nearby animals.
   //                   Empty tiles are represented by a space character (' '). You are at surroundings[1][1].
   //                   For example, to your right would be surroundings[1][2], and above you is surroundings[0][1].
   //                   Your surroundings are updated just before being asked to move,
   //                   but may be out of date when asked to fight.
   public MaxWolf() {
      // TODO enter your unique letter
      super('Q');
      /* Optional code here */
   }

   public Attack fight(char c)
   // TODO implement this method

   {
      if (c == 'L') {
         return Math.random() > 0.5 ? Attack.PAPER : Attack.SCISSORS;

      } else if (c == 'S') {

         return Attack.PAPER;
      } else if (c == 'B') {
         return Attack.SCISSORS;

      } else if (c == 'D') {
         return Attack.PAPER;
      } else if (c == 'L') {
         return Attack.SCISSORS;
      }


      return Attack.ROCK; // can be removed for something else


   }


   public Move move() {
      if (lookLeft() == 'S') {
         return Move.LEFT;
      }
      // TODO implement this method
if(lookLeft() == 'D')

   {
   return Move.LEFT;
   }


      if(lookRight() == 'D')

      {
         return Move.LEFT;
      }
      return Move.DOWN; // can be removed for something else
   }
   private char lookLeft()
   {
      //TODO return the character of the field on the left side
      return surroundings[1][0]; // can be removed for something else
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
