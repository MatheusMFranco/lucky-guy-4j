package org.magalzim;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LuckyGuyTest {

    private LuckyGuy luckyGuy;

    @BeforeEach
    public void setUp() {
        luckyGuy = new LuckyGuy();
    }

    @Test
    void testBinary() {
        int result = luckyGuy.binary();
        assertTrue(result == 1 || result == 0);
    }

    @Test
    void testDice() {
        int result = luckyGuy.dice(6);
        assertTrue(result >= 1 && result <= 6);
    }

    @Test
    void testCoin() {
        String result = luckyGuy.coin();
        assertTrue(result.equals("Heads") || result.equals("Tails"));
    }

    @Test
    void testConfirmation() {
        String result = luckyGuy.confirmation();
        assertTrue(result.equals("Yes") || result.equals("No"));
    }

    @Test
    void testJokenpo() {
        String result = luckyGuy.jokenpo();
        assertTrue(result.equals("Rock") || result.equals("Paper") || result.equals("Scissors"));
    }

    @Test
    void testAlphabet() {
        String result = luckyGuy.alphabet();
        assertEquals(1, result.length());
        assertTrue(Character.isLetter(result.charAt(0)));
    }

    @Test
    void testOddsAndEvens() {
        String result = luckyGuy.oddsAndEvens(1, 2);
        assertTrue(result.equals("Odd") || result.equals("Even"));
    }

    @Test
    void testCustom() {
        List<String> customList = Arrays.asList("Option1", "Option2", "Option3");
        String result = luckyGuy.custom(customList);
        assertTrue(customList.contains(result));
    }
}
