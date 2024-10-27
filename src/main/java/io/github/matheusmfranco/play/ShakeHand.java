package io.github.matheusmfranco.play;

import io.github.matheusmfranco.model.Jokenpo;
import java.util.Locale;

public class ShakeHand extends FacePlay {

  public ShakeHand(Locale language) {
    super(language);
  }

  public String play() {
    return toSides(Jokenpo.class);
  }
}
