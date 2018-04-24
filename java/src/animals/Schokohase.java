package animals;

// Optional code here
public class Schokohase extends Animal {
    // Optional code here

    // Available variables:
    // - surroundings    A zero indexed, 3 by 3 matrix of characters that represent nearby animals.
    //                   Empty tiles are represented by a space character (' '). You are at surroundings[1][1].
    //                   For example, to your right would be surroundings[1][2], and above you is surroundings[0][1].
    //                   Your surroundings are updated just before being asked to move,
    //                   but may be out of date when asked to fight.
    // - MAP_SIZE        The size of the map, as a int
    public Schokohase() {
        super('W');
        /* Optional code here */
    }
    public Attack fight(char c) {
        switch(c){
            case 'B': return Attack.SCISSORS;
            case 'S': return Attack.PAPER;
            case 'L': return Attack.SCISSORS;
            default: return Attack.PAPER;
        }
    }
    public Move move() {
        /* Required code here. Must return a Move. */
        if (surroundings[0][0] == 'B') {

        }
        return Move.DOWN; // can be removed for something else
    }
}
