package animals;

// Optional code here
public class Wolf extends Animal {
    // Optional code here
    public Wolf() {
        super('W');
        /* Optional code here */
    }
    public Attack fight(char c) {
        /* Required code here. Must return an Attack. */
        return Attack.ROCK; // can be removed for something else
    }
    public Move move() {
        /* Required code here. Must return a Move. */
        return Move.DOWN; // can be removed for something else
    }
}
