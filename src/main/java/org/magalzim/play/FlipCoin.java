package org.magalzim.play;

import org.magalzim.model.Coin;

import java.util.Locale;

public class FlipCoin extends FacePlay {

    public FlipCoin(Locale language) {
        super(language);
    }

    public String play() {
        return toSides(Coin.class);
    }

}
