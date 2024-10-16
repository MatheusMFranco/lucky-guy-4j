package org.magalzim;

import lombok.Data;
import org.magalzim.play.Dice;

import java.util.List;
import java.util.Locale;

/**
 * The Facade class provides a simplified interface for interacting with various "play" games such as rolling dice,
 * flipping coins, binary outcomes, and custom lists. It allows setting and getting the language and offers methods
 * for different game logic.
 *
 * The following languages are supported:
 * - 'en' (English)
 * - 'pt' (Portuguese)
 * - 'es' (Spanish)
 * - 'fr' (French)
 * - 'de' (German)
 * - 'it' (Italian)
 */
@Data
public class LuckyGuy {
    private final Locale language = Locale.ENGLISH;

    /**
     * Plays a binary game, returning either 1 or 2.
     * @returns A number representing a binary outcome (1 or 2).
     */
    public int binary() {
        return Integer.parseInt(new Dice().play());
    }

    /**
     * Rolls a dice with the specified number of sides. Default is 6 sides.
     * @param sides The number of sides of the dice (default is 6).
     * @returns A number representing the outcome of the dice roll.
     */
    public int dice(int sides) {
        return new RollDice().play(sides);
    }

    /**
     * Flips a coin and returns the result based on the current language.
     * @returns A string representing the coin flip outcome ('Heads' or 'Tails') in the current language.
     */
    public String coin() {
        return new FlipCoin(this.language).play();
    }

    /**
     * Returns a confirmation result such as "Yes" or "No" based on the current language.
     * @returns A string representing "Yes" or "No" in the current language.
     */
    public String confirmation() {
        return new SaySomething(this.language).play();
    }

    /**
     * Plays a game of rock-paper-scissors (jokenpo) and returns the result in the current language.
     * @returns A string representing the outcome of rock-paper-scissors (e.g., 'Rock', 'Paper', or 'Scissors').
     */
    public String jokenpo() {
        return new ShakeHand(this.language).play();
    }

    /**
     * Returns a random letter from the alphabet in the current language.
     * @returns A string representing a randomly selected letter.
     */
    public String alphabet() {
        return new ShowLetter(this.language).play();
    }

    /**
     * Returns the result of the "Odds or Evens" game.
     * @param firstHand The value of the first hand (e.g., the number of fingers shown).
     * @param secondHand The value of the second hand (e.g., the number of fingers shown).
     * @returns A string representing the game outcome.
     */
    public String oddsAndEvens(int firstHand, int secondHand) {
        return new OneTwoGo(this.language).play(firstHand + secondHand);
    }

    /**
     * Plays a custom game using a provided list of options and returns a random option.
     * @param list An array of strings representing the custom list of options.
     * @returns A string representing a randomly selected option from the list.
     */
    public String custom(List<String> list) {
        return new Custom(list).play();
    }
}
