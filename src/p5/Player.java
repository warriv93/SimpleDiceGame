package p5;

/**
 * En Player representerar en spelare som kan kasta en tärning
 * @author TSROAX
 *
 */
public abstract class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract int throwDice();
}
