package org.magalzim.play;

import org.magalzim.model.ShortResponse;

import java.util.Locale;

public class SaySomething extends FacePlay {

    public SaySomething(Locale language) {
        super(language);
    }

    public String play() {
        return toSides(ShortResponse.class);
    }

}
