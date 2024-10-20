package io.github.matheusmfranco.play;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AlphabetTest {

    @Test
    void testPlayReturnsValidLetter() {
        Alphabet alphabet = new Alphabet();

        String result = alphabet.play();

        assertNotNull(result, "The result should not be null");
        assertEquals(1, result.length(), "The result should be a single character");

        char letter = result.charAt(0);
        assertTrue(letter >= 'A' && letter <= 'Z', "The result should be a letter between 'A' and 'Z'");
    }

    @Test
    void testRandomizeWithinBounds() {
        Alphabet alphabet = new Alphabet();

        for (int i = 0; i < 100; i++) {
            int randomValue = alphabet.randomize(26);
            assertTrue(randomValue >= 0 && randomValue < 26,
                    "The random value should be between 0 and 25 (inclusive)");
        }
    }
}
