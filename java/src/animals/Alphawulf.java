package animals;

// Optional code here
public class Alphawulf extends Animal {
    // Optional code here

    // Available variables:
    // - surroundings    A zero indexed, 3 by 3 matrix of characters that represent nearby animals.
    //                   Empty tiles are represented by a space character (' '). You are at surroundings[1][1].
    //                   For example, to your right would be surroundings[1][2], and above you is surroundings[0][1].
    //                   Your surroundings are updated just before being asked to move,
    //                   but may be out of date when asked to fight.
    // - MAP_SIZE        The size of the map, as a int
    public Alphawulf() {
        super('W');
        /* Optional code here */
    }
    public Attack fight(char c) {
        /* Required code here. Must return an Attack. */
        for(int i=0;i<surroundings.length;i++){
            for(int j=0;j<surroundings[0].length;j++) {
                switch(surroundings[i][j]){
                    case 'L':
                        if((int) Math.ceil(Math.random() * 2)==2){
                            return Attack.ROCK;
                        }else{
                            return Attack.SCISSORS;
                        }

                    case 'B':
                        return Attack.SCISSORS;

                    case 'S':
                        return Attack.PAPER;

                        case 'W':
                    default:
                            return Attack.SCISSORS; // can be removed for something else

                }
            }

        }
        return Attack.SCISSORS; // can be removed for something else

    }
    public Move move() {
        /* Required code here. Must return a Move. */
        return Move.HOLD; // can be removed for something else
    }
}
