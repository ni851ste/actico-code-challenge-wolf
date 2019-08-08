package animals;

// Optional code here
public class GroupWolf_2 extends Animal
{
   // Optional code here

   // Available variables:
   // - surroundings    A zero indexed, 3 by 3 matrix of characters that represent nearby animals.
   //                   Empty tiles are represented by a space character (' '). You are at surroundings[1][1].
   //                   For example, to your right would be surroundings[1][2], and above you is surroundings[0][1].
   //                   Your surroundings are updated just before being asked to move,
   //                   but may be out of date when asked to fight.
   public GroupWolf_2()
   {
      // TODO enter your unique letter
      super('2');
      /* Optional code here */
   }

   public Attack fight(char c)
   {
      switch (c) {
         case 'L':
            return Attack.SCISSORS;
         case 'B':
            return Attack.SCISSORS;
         case 'S':
            return Attack.PAPER;
         default:
            return Attack.PAPER;
      }
   }

   public Move move() {

      if (lookDown() == 'L' || lookDown() == '1' || lookDown() == '3')
      {
         return Move.UP;
      }
      else if (lookLeft() == 'L' || lookLeft() == '1' || lookLeft() == '3')
      {
         return Move.RIGHT;
      }
      else if (lookRight() == 'L' || lookRight() == '1' || lookRight() == '3')
      {
         return Move.LEFT;
      }
      else if (lookUp() == 'L' || lookUp() == '1' || lookUp() == '3')
      {
         return Move.DOWN;
      }
      else if (lookLeft() == 'S'  || lookLeft() == 'N' || lookLeft() == 'B')
      {
         return Move.LEFT;
      }
      else if (lookRight() == 'S' || lookRight() == 'N' || lookRight() == 'B')
      {
         return Move.RIGHT;
      }
      else if (lookUp() == 'S' || lookUp() == 'N' || lookUp() == 'B')
      {
         return Move.UP;
      }
      else if (lookDown() == 'S' || lookDown() == 'N' || lookDown() == 'B')
      {
       return Move.DOWN;
      }
      return Move.UP;
   }

   private char lookLeft()
   {
      //TODO return the character of the field on the left side
      return surroundings[1] [0]; // can be removed for something else
   }

   private char lookRight()
   {
      //TODO return the character of the field on the right side
      return surroundings[1] [2]; // can be removed for something else
   }

   private char lookUp()
   {
      //TODO return the character of the field above
      return surroundings[0] [1]; // can be removed for something else
   }

   private char lookDown()
   {
      //TODO return the character of the field below
      return surroundings[2] [1]; // can be removed for something else
   }
}
