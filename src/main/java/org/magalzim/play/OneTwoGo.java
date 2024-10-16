package org.magalzim.play;

import org.magalzim.model.OddsOrEvens;

public class OneTwoGo extends FacePlay {

    public String play() {
        return toSides(OddsOrEvens.class);
    }

}
