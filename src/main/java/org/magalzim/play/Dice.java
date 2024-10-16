package org.magalzim.play;

public class Dice extends Play {

    public String play(Integer sides) {
        if (sides == null || sides <= 0) {
            return play();
        }
        return Integer.toString(randomize(sides) + 1);
    }

    @Override
    public String play() {
        final int BINARY = 2;
        return randomize(BINARY).toString();
    }

}
