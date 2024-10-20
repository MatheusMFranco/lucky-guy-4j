package io.github.matheusmfranco.play;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ShakeHandTest {

    private ShakeHand jokenpo;

    @BeforeEach
    public void setUp() {
        jokenpo = new ShakeHand(Locale.ENGLISH);
    }

    @Test
    void testPlayReturnsHeadsOrTails() {
        String result = jokenpo.play();

        assertTrue(result.equals("Rock") || result.equals("Paper") || result.equals("Scissors"),
                "The result should be either 'Scissors', 'Paper' or 'Rock'");
    }

    @Test
    void testPlayWithDifferentLanguage() {
        jokenpo = new ShakeHand(Locale.of("pt"));
        String result = jokenpo.play();

        assertTrue(result.equals("Pedra") || result.equals("Papel") || result.equals("Tesoura"),
                "The result should be either 'Pedra', 'Papel' or 'Tesoura' in Portuguese");
    }

}