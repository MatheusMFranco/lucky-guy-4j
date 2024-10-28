package io.github.matheusmfranco;

import io.github.matheusmfranco.model.OddsOrEvens;
import io.github.matheusmfranco.play.*;
import java.util.List;
import java.util.Locale;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * The Facade class provides a simplified interface for interacting with various "play" games such
 * as rolling dice, flipping coins, binary outcomes, and custom lists. It allows setting and getting
 * the language and offers methods for different game logic. The following languages are supported:
 * - 'en' (English) - 'pt' (Portuguese) - 'es' (Spanish) - 'fr' (French) - 'de' (German) - 'it'
 * (Italian)
 */
@Data
@AllArgsConstructor
public class LuckyGuy {

  private Locale language;

  public LuckyGuy() {
    language = Locale.ENGLISH;
  }

  /**
   * Plays a binary game, returning either 1 or 2.
   *
   * @return A number representing a binary outcome (1 or 2).
   */
  public int binary() {
    return Integer.parseInt(new Dice().play());
  }

  /**
   * Rolls a die with the specified number of sides.
   *
   * @param sides The number of sides of the dice
   * @return A number representing the outcome of the dice roll.
   */
  public int dice(Integer sides) {
    return Integer.parseInt(new Dice().play(sides)) + 1;
  }

  /**
   * Rolls a die with 6 sides.
   *
   * @return A number representing the outcome of the dice roll.
   */
  public int dice() {
    return Integer.parseInt(new Dice().play(6)) + 1;
  }

  /**
   * Flips a coin and returns the result based on the current language.
   *
   * @return A string representing the coin flip outcome ('Heads' or 'Tails') in the current
   *     language.
   */
  public String coin() {
    return new FlipCoin(language).play();
  }

  /**
   * Returns a confirmation result such as "Yes" or "No" based on the current language.
   *
   * @return A string representing "Yes" or "No" in the current language.
   */
  public String confirmation() {
    return new SaySomething(language).play();
  }

  /**
   * Plays a game of rock-paper-scissors (jokenpo) and returns the result in the current language.
   *
   * @return A string representing the outcome of rock-paper-scissors (e.g., 'Rock', 'Paper', or
   *     'Scissors').
   */
  public String jokenpo() {
    return new ShakeHand(language).play();
  }

  /**
   * Returns a random letter from the alphabet in the current language.
   *
   * @return A string representing a randomly selected letter.
   */
  public String alphabet() {
    return new Alphabet().play();
  }

  /**
   * Returns the result of the "Odds or Evens" game.
   *
   * @param firstHand The value of the first hand (e.g., the number of fingers shown).
   * @param secondHand The value of the second hand (e.g., the number of fingers shown).
   * @return A string representing the game outcome.
   */
  public String oddsAndEvens(int firstHand, int secondHand) {
    int result = firstHand + secondHand;
    OddsOrEvens outcome = result % 2 == 0 ? OddsOrEvens.EVEN : OddsOrEvens.ODD;
    return outcome.fetchTranslation(language);
  }

  /**
   * Returns the result of the "Odds or Evens" game.
   *
   * @return A string representing the game outcome.
   */
  public String oddsAndEvens() {
    return new OneTwoGo(language).play();
  }

  /**
   * Plays a custom game using a provided list of options and returns a random option.
   *
   * @param list An array of strings representing the custom list of options.
   * @return A string representing a randomly selected option from the list.
   */
  public String custom(List<String> list) {
    return new Custom(list).play();
  }
}
