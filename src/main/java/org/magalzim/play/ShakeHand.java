package org.magalzim.play;

import org.magalzim.model.Jokenpo;

import java.util.Locale;

public class ShakeHand extends FacePlay {

    public ShakeHand(Locale language) {
        super(language);
    }

    public String play() {
        return toSides(Jokenpo.class);
    }

}
