package Entity.Monster;

import Entity.Entity;

import java.util.Random;

public class Snake extends Entity {
    private static final Random random = new Random();

    public Snake() {
        super("Snake", random.nextInt(3, 7), 12, 0);
    }
}