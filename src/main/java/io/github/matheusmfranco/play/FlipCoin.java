package io.github.matheusmfranco.play;

import io.github.matheusmfranco.model.Coin;

import java.util.Locale;

public class FlipCoin extends FacePlay {

    public FlipCoin(Locale language) {
        super(language);
    }

    public String play() {
        return toSides(Coin.class);
    }

}
