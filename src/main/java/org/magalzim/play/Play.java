package org.magalzim.play;

import java.util.Random;

public abstract class Play {

    public abstract String play();

    protected Integer randomize(int sides) {
        return new Random().nextInt(sides);
    }
}
