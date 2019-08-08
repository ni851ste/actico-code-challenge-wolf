package animals;

// Optional code here
public class GroupWolf_1 extends Animal
{
   // Optional code here

   // Available variables:
   // - surroundings    A zero indexed, 3 by 3 matrix of characters that represent nearby animals.
   //                   Empty tiles are represented by a space character (' '). You are at surroundings[1][1].
   //                   For example, to your right would be surroundings[1][2], and above you is surroundings[0][1].
   //                   Your surroundings are updated just before being asked to move,
   //                   but may be out of date when asked to fight.
   public GroupWolf_1()
   {
      // TODO enter your unique letter
      super('1');
      /* Optional code here */
   }

   public Attack fight(char c)
   {
      // TODO implement this method
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
        if (lookDown() == 'S') {
            return Move.DOWN;
        }

        if (lookLeft() == 'S') {
            return Move.LEFT;
        }

        if (lookUp() == 'S') {
            return Move.UP;
        }

        if (lookRight() == 'S') {
            return Move.RIGHT;
        }

        if (lookDown() == 'B') {
            return Move.DOWN;
        }

        if (lookLeft() == 'B') {
            return Move.LEFT;
        }

        if (lookUp() == 'B') {
            return Move.UP;
        }

        if (lookRight() == 'B') {
            return Move.RIGHT;
        }

        if (lookRight() == 'L') {
            return Move.LEFT;
        }

        if (lookDown() == 'L') {
            return Move.UP;
        }

        if (lookLeft() == 'L') {
            return Move.RIGHT;
        }


        if (lookUp() == 'L') {
            return Move.DOWN;
        }

        if (lookUp() == 'N' || lookUp() == '2' || lookUp() == 'Y' || lookUp() == '3') {
            return Move.DOWN;
        }

        if (lookDown() == 'N' || lookDown() == '2' || lookDown() == 'Y' || lookDown() == '3') {
            return Move.UP;
        }

        if (lookLeft() == 'N' || lookLeft() == '2' || lookLeft() == 'Y' || lookLeft() == '3') {
            return Move.RIGHT;
        }

        if (lookRight() == 'N' || lookRight() == '2' || lookRight() == 'Y' || lookRight() == '3') {
            return Move.LEFT;
        }

        return Move.DOWN;
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
