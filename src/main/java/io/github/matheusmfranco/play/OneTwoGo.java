package io.github.matheusmfranco.play;

import io.github.matheusmfranco.model.OddsOrEvens;

import java.util.Locale;

public class OneTwoGo extends FacePlay {

    public OneTwoGo(Locale language) {
        super(language);
    }

    public String play() {
        return toSides(OddsOrEvens.class);
    }

}
