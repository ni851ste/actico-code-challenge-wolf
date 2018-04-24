package animals;

// Optional code here
public class DefaultWolfDL extends Animal {
    // Optional code here

    // Available variables:
    // - surroundings    A zero indexed, 3 by 3 matrix of characters that represent nearby animals.
    //                   Empty tiles are represented by a space character (' '). You are at surroundings[1][1].
    //                   For example, to your right would be surroundings[1][2], and above you is surroundings[0][1].
    //                   Your surroundings are updated just before being asked to move,
    //                   but may be out of date when asked to fight.
    // - MAP_SIZE        The size of the map, as a int
    public DefaultWolfDL() {
        super('W');
        /* Optional code here */
    }
    public Attack fight(char c) {
        /* Required code here. Must return an Attack. */
        for(int i = 0; i <=2; i++) {
            for(int j = 0; j<=2; j++){
                if(i== 1 && j == 1){
                    continue;
                }
                else if(surroundings[i][j] == 'L'){
                    return Attack.SCISSORS;
                }
                else if(surroundings[i][j] == 'B'){
                    return Attack.SCISSORS;
                }
                else if(surroundings[i][j] == 'S'){
                    return Attack.PAPER;
                }
                else if(surroundings[i][j] == 'W'){
                    return Attack.SCISSORS;
                }
            }

        }
        return Attack.SCISSORS;

    }
    public Move move() {
        for(int i = 0; i <=2; i++) {
            for(int j = 0; j<=2; j++){
                if(i== 1 && j == 1){
                    continue;
                }
                else if(surroundings[i][j] == 'L'){
                    return Move.LEFT;
                }
                else if(surroundings[i][j] == 'B'){
                    return Move.LEFT;
                }
                else if(surroundings[i][j] == 'S'){
                    return Move.RIGHT;
                }
                else if(surroundings[i][j] == 'W'){
                    return Move.RIGHT;
                }
            }

        }
        return Move.UP;
    }
}
