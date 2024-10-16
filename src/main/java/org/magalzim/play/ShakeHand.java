package org.magalzim.play;

import org.magalzim.model.Jokenpo;
import org.magalzim.model.ShortResponse;

public class ShakeHand extends FacePlay {

    public String play() {
        return toSides(Jokenpo.class);
    }

}
