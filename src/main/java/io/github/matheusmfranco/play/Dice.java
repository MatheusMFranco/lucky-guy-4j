package io.github.matheusmfranco.play;

public class Dice extends Play {

  public String play(Integer sides) {
    if (sides == null || sides <= 0) {
      return play();
    }
    int selected = randomize(sides);
    return Integer.toString(selected);
  }

  @Override
  public String play() {
    final int BINARY = 2;
    return randomize(BINARY).toString();
  }
}
