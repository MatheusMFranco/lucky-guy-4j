package org.magalzim.play;

import org.magalzim.model.ShortResponse;

public class SaySomething extends FacePlay {

    public String play() {
        return toSides(ShortResponse.class);
    }

}
