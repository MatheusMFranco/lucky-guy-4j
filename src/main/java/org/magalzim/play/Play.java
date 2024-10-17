package org.magalzim.play;

import java.util.Random;

public abstract class Play {

    private static final Random RANDOM = new Random();

    public abstract String play();

    protected final Integer randomize(int sides) {
        if (sides <= 0) {
            throw new IllegalArgumentException("Number of sides must be greater than 0");
        }
        return RANDOM.nextInt(sides);
    }
}
