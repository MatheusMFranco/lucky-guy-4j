package io.github.matheusmfranco.play;

import java.util.Random;

public abstract class Play {

    private static final Random RANDOM = new Random();

    public abstract String play();

    protected final Integer randomize(int sides) {
        final int MIN_SIDES = 2;
        if (sides < MIN_SIDES) {
            throw new IllegalArgumentException("Number of sides must be greater than 0");
        }
        return RANDOM.nextInt(sides);
    }
}
