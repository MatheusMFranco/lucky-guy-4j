package io.github.matheusmfranco.play;

public class Alphabet extends Play {

  public String play() {
    final int SIZE = 26;
    return String.valueOf((char) ('A' + randomize(SIZE)));
  }
}
