package animals;

// Optional code here
public class emlwolf extends Animal {
    // Optional code here

    // Available variables:
    // - surroundings    A zero indexed, 3 by 3 matrix of characters that represent nearby animals.
    //                   Empty tiles are represented by a space character (' '). You are at surroundings[1][1].
    //                   For example, to your right would be surroundings[1][2], and above you is surroundings[0][1].
    //                   Your surroundings are updated just before being asked to move,
    //                   but may be out of date when asked to fight.
    public emlwolf() {
        // TODO enter your unique letter
        super('C');
        /* Optional code here */
    }

    public Attack fight(char c) {
        if (c == 'S') {
            return Attack.PAPER;
        }
        if (c == 'B') {
            return Attack.SCISSORS;
        }
        if (c == 'L') {
            return Math.random() > 0.5 ? Attack.ROCK : Attack.SCISSORS;
        }
        if (c=='D')
        {
            return Attack.PAPER;
        }
        return Math.random() > 0.5 ? Attack.PAPER : Attack.SCISSORS;



    }

    public Move move() {
        if(lookLeft()==' '|| lookDown() ==' ' || lookRight() ==' ' || lookUp() ==' ')
        {
            return Move.DOWN;
        }
        if (lookLeft() != 'B' || lookLeft()!='S' || lookLeft()!=' '|| lookLeft()!='D') {
            return Move.RIGHT;
        }
        if (lookRight() != 'B' || lookRight()!='S'|| lookRight()!=' '|| lookRight()!='D') {
            return Move.LEFT;
        }
        if (lookUp() != 'B' || lookUp()!='S'|| lookUp()!=' '|| lookUp()!='D') {
            return Move.DOWN;
        }
        if (lookDown() != 'B' || lookDown()!='S'|| lookDown()!=' '|| lookDown()!='D') {
            return Move.UP;
        }

        return Move.DOWN;


    }

    private char lookLeft() {
        return surroundings[1][0];
    }

    private char lookRight() {
        //TODO return the character of the field on the right side
        return ' '; // can be removed for something else
    }

    private char lookUp() {
        //TODO return the character of the field above
        return ' '; // can be removed for something else
    }

    private char lookDown() {
        //TODO return the character of the field below
        return ' '; // can be removed for something else
    }
}
