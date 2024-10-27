package io.github.matheusmfranco.play;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlayTest {

  private PlayTestImplementation playTest;

  static class PlayTestImplementation extends Play {
    @Override
    public String play() {
      return "test";
    }
  }

  @BeforeEach
  public void setUp() {
    playTest = new PlayTestImplementation();
  }

  @Test
  void testRandomize_withValidSides() {
    int sides = 6;
    int result = playTest.randomize(sides);
    assertTrue(result >= 0 && result < sides, "Result should be within the range [0, sides-1]");
  }

  @Test
  void testRandomize_withZeroSides() {
    IllegalArgumentException exception =
        assertThrows(
            IllegalArgumentException.class,
            () -> {
              playTest.randomize(0);
            });
    assertEquals("Number of sides must be greater than 0", exception.getMessage());
  }

  @Test
  void testRandomize_withNegativeSides() {
    IllegalArgumentException exception =
        assertThrows(
            IllegalArgumentException.class,
            () -> {
              playTest.randomize(-5);
            });
    assertEquals("Number of sides must be greater than 0", exception.getMessage());
  }

  @Test
  void testRandomizeReturnsWithinRange() {
    int sides = 10;
    int result = playTest.randomize(sides);
    boolean isWithinRange = result >= 0 && result < sides;
    assertTrue(isWithinRange);
  }
}
