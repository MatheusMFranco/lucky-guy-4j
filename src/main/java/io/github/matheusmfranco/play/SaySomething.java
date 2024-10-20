package io.github.matheusmfranco.play;

import io.github.matheusmfranco.model.ShortResponse;

import java.util.Locale;

public class SaySomething extends FacePlay {

    public SaySomething(Locale language) {
        super(language);
    }

    public String play() {
        return toSides(ShortResponse.class);
    }

}
