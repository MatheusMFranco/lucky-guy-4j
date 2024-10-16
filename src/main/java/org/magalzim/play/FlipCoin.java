package org.magalzim.play;

import org.magalzim.model.Coin;

public class FlipCoin extends FacePlay {

    public String play() {
        return toSides(Coin.class);
    }

}
