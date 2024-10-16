package org.magalzim.play;

public class Alphabet extends Play {

    public String play() {
        final int SIZE = 26;
        return String.valueOf('A' + randomize(SIZE));
    }

}
