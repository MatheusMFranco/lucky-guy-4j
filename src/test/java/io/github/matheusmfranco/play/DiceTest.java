package io.github.matheusmfranco.play;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DiceTest {

  @Test
  void testPlayWithDefault() {
    Dice dice = new Dice();

    String result = dice.play();

    assertTrue(
        result.equals("0") || result.equals("1"),
        "The result should be either '0' or '1' for binary play");
  }

  @Test
  void testPlayWithValidSides() {
    Dice dice = new Dice();
    int sides = 20;

    String result = dice.play(sides);

    int rolledValue = Integer.parseInt(result);
    assertTrue(
        rolledValue >= 0 && rolledValue < sides,
        "The rolled value should be between 1 and " + sides);
  }

  @Test
  void testPlayWithNullSides() {
    Dice dice = new Dice();

    String result = dice.play(null);

    assertTrue(
        result.equals("0") || result.equals("1"),
        "The result should be either '0' or '1' for binary play when sides are null");
  }

  @Test
  void testPlayWithNegativeSides() {
    Dice dice = new Dice();

    String result = dice.play(-4);

    assertTrue(
        result.equals("0") || result.equals("1"),
        "The result should be either '0' or '1' for binary play when sides are negative");
  }

  @Test
  void testPlayWithZeroSides() {
    Dice dice = new Dice();

    String result = dice.play(0);

    assertTrue(
        result.equals("0") || result.equals("1"),
        "The result should be either '0' or '1' for binary play when sides are zero");
  }
}
