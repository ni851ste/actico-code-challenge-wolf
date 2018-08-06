package animals;

// Optional code here
public class LarryWolf extends Animal {
    // Optional code here

    // Available variables:
    // - surroundings    A zero indexed, 3 by 3 matrix of characters that represent nearby animals.
    //                   Empty tiles are represented by a space character (' '). You are at surroundings[1][1].
    //                   For example, to your right would be surroundings[1][2], and above you is surroundings[0][1].
    //                   Your surroundings are updated just before being asked to move,
    //                   but may be out of date when asked to fight.
    public LarryWolf() {
        // TODO enter your unique letter
        super('V');
        /* Optional code here */
    }

    public Attack fight(char c) {
        if (c == 'S') {
            return Attack.PAPER;
        }
        if (c == 'B') {
            return Attack.SCISSORS;
        }
        if (c == 'Y')
        {
            return Attack.PAPER;
        }

        // TODO implement this method
        // return Attack.ROCK; // can be removed for something else

        if (Math.random() < (1 / 3)) {
            return Attack.SCISSORS;
        } else if (Math.random() < (2 / 3)) {
            return Attack.ROCK;
        } else
        {
            return Attack.PAPER;
        }


    }


    public Move move() {
        if (lookLeft() == 'L') {
            return Move.UP;
        }
        if (lookRight() == 'L') {
            return Move.UP;
        }
        if (lookUp() == 'L') {
            return Move.LEFT;
        }
        if (lookDown() == 'L') {
            return Move.UP;
        }
        if (lookLeft() == 'S') {
            return Move.LEFT;
        }
        if (lookRight() == 'S') {
            return Move.RIGHT;
        }
        if (lookUp() == 'S') {
            return Move.UP;
        }
        if (lookDown() == 'S') {
            return Move.DOWN;
        }
        if (lookLeft() == 'B') {
            return Move.LEFT;
        }
        if (lookRight() == 'B') {
            return Move.RIGHT;
        }
        if (lookUp() == 'B') {
            return Move.UP;
        }
        if (lookDown() == 'B') {
            return Move.DOWN;
        }
        if (lookLeft() == 'J') {
            return Move.UP;
        }
        if (lookRight() == 'J') {
            return Move.UP;
        }
        if (lookUp() == 'J') {
            return Move.LEFT;
        }
        if (lookDown() == 'J') {
            return Move.UP;
        }
        // TODO implement this method
        return Move.DOWN; // can be removed for something else
    }

    private char lookLeft() {
        //TODO return the character of the field on the left side
        return surroundings[1][0]; // can be removed for something else
    }

    private char lookRight() {
        //TODO return the character of the field on the right side
        return surroundings[1][2]; // can be removed for something else
    }

    private char lookUp() {
        //TODO return the character of the field above
        return surroundings[0][1]; // can be removed for something else
    }

    private char lookDown() {
        //TODO return the character of the field below
        return surroundings[2][1]; // can be removed for something else
    }
}
