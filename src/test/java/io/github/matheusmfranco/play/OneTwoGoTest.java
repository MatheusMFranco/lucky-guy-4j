package io.github.matheusmfranco.play;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Locale;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OneTwoGoTest {

  private OneTwoGo adedonha;

  @BeforeEach
  public void setUp() {
    adedonha = new OneTwoGo(Locale.ENGLISH);
  }

  @Test
  void testPlayReturnsHeadsOrTails() {
    String result = adedonha.play();

    assertTrue(
        result.equals("Odd") || result.equals("Even"),
        "The result should be either 'Odd' or 'Even'");
  }

  @Test
  void testPlayWithDifferentLanguage() {
    adedonha = new OneTwoGo(Locale.of("pt"));
    String result = adedonha.play();

    assertTrue(
        result.equals("Ímpar") || result.equals("Par"),
        "The result should be either 'Par' or 'Ímpar' in Portuguese");
  }
}
