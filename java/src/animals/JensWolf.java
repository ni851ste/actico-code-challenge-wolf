package animals;

import java.util.Random;

// Optional code here
public class JensWolf extends Animal {

    private Random random;

    // Available variables:
    // - surroundings    A zero indexed, 3 by 3 matrix of characters that represent nearby animals.
    //                   Empty tiles are represented by a space character (' '). You are at surroundings[1][1].
    //                   For example, to your right would be surroundings[1][2], and above you is surroundings[0][1].
    //                   Your surroundings are updated just before being asked to move,
    //                   but may be out of date when asked to fight.
    public JensWolf() {
        super('J');
        random = new Random();
    }

    public Attack fight(char c) {
        switch (c) {
            case 'L':
            case 'B':
                return Attack.SCISSORS;
            case 'S':
            case 'W':
            case 'D': return Attack.PAPER;
            default:
                switch (c % 3) {
                    case 0:
                        return Attack.PAPER;
                    case 1:
                        return Attack.ROCK;
                    case 2:
                        return Attack.SCISSORS;
                    default: return Attack.ROCK;

                }
        }
    }

    public Move move() {
        if(lookDown() == 'S'){
            return  Move.DOWN;
        }
        if(lookUp() == 'S'){
            return Move.UP;
        }
        if(lookRight() == 'S'){
            return Move.RIGHT;
        }
        if(lookLeft() == 'S'){
            return Move.LEFT;
        }

        if (lookLeft() == 'L'){
            switch (lookLeft() % 3){
                case 0: return Move.UP;
                case 1 : return Move.DOWN;
                case 2 : return Move.RIGHT;
                default: return Move.HOLD;
            }
        }
        if (lookRight() == 'L'){
            switch (lookRight() % 3){
                case 0: return Move.LEFT;
                case 1 : return Move.DOWN;
                case 2 : return Move.UP;
                default: return Move.HOLD;
            }
        }
        if (lookUp() == 'L'){

            switch (lookUp() % 3){
                case 0: return Move.DOWN;
                case 1 : return Move.LEFT;
                case 2 : return Move.RIGHT;
                default: return Move.HOLD;
            }
        }
        if (lookDown() == 'L'){

            switch (lookDown() %3){
                case 0: return Move.UP;
                case 1 : return Move.LEFT;
                case 2 : return Move.RIGHT;
                default: return Move.HOLD;
            }
        }
        return random.nextInt() > 0.5 ? moveUpOrRight() : moveDownOrLeft();
    }

    private Move moveUpOrRight() {
        return random.nextInt() > 0.34 ? Move.UP : Move.RIGHT;
    }
    private Move moveDownOrLeft(){
        return random.nextInt() >66 ? Move.DOWN : Move.LEFT;
    }

    private char lookLeft() {
        return surroundings[1][0];
    }

    private char lookRight() {
        return surroundings[1][2];
    }

    private char lookUp() {
        return surroundings[0][1];
    }

    private char lookDown() {
        return surroundings[2][1];
    }
}
