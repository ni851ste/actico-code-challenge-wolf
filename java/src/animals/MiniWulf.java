package animals;

// Optional code here
public class MiniWulf extends Animal {
    // Optional code here

    // Available variables:
    // - surroundings    A zero indexed, 3 by 3 matrix of characters that represent nearby animals.
    //                   Empty tiles are represented by a space character (' '). You are at surroundings[1][1].
    //                   For example, to your right would be surroundings[1][2], and above you is surroundings[0][1].
    //                   Your surroundings are updated just before being asked to move,
    //                   but may be out of date when asked to fight.
    // - MAP_SIZE        The size of the map, as a int
    public MiniWulf() {
        super('W');
        /* Optional code here */
    }
    public Attack fight(char c) {
        /* Required code here. Must return an Attack. */
        if(c=='B')
            return Attack.SCISSORS;
        else if(c=='L')
                return Attack.SCISSORS;
        else if(c=='S')
                return Attack.PAPER;
        else if(c=='W')
                return Attack.ROCK;
        return Attack.ROCK; // can be removed for something else
    }
    public Move move() {
        /* Required code here. Must return a Move. */

        if(surroundings[0][0] =='W')
                return Move.RIGHT;
        else if (surroundings[0][1] =='W')
                return Move.LEFT;
        else if (surroundings[0][2] =='W')
                return Move.LEFT;
        else if (surroundings[1][0] =='W')
                return Move.RIGHT;
        else if (surroundings[1][2] =='W')
                return Move.LEFT;
        else if (surroundings[2][0] =='W')
                return Move.UP;


            return Move.DOWN;
        }

         // can be removed for something else
    }

