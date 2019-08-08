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
      return Attack.ROCK; // can be removed for something else
   }

   public Move move()
   {
      // TODO implement this method
      return Move.DOWN; // can be removed for something else
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
