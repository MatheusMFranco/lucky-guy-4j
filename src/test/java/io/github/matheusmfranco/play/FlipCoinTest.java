package io.github.matheusmfranco.play;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

class FlipCoinTest {

    private FlipCoin flipCoin;

    @BeforeEach
    public void setUp() {
        flipCoin = new FlipCoin(Locale.ENGLISH);
    }

    @Test
    void testPlayReturnsHeadsOrTails() {
        String result = flipCoin.play();

        assertTrue(result.equals("Heads") || result.equals("Tails"),
                "The result should be either 'Heads' or 'Tails'");
    }

    @Test
    void testPlayWithDifferentLanguage() {
        flipCoin = new FlipCoin(Locale.of("pt"));
        String result = flipCoin.play();

        assertTrue(result.equals("Cara") || result.equals("Coroa"),
                "The result should be either 'Cara' or 'Coroa' in Portuguese");
    }

}
