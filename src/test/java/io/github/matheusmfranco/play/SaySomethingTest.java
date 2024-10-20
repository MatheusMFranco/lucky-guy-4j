package io.github.matheusmfranco.play;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SaySomethingTest {

    private SaySomething answer;

    @BeforeEach
    public void setUp() {
        answer = new SaySomething(Locale.ENGLISH);
    }

    @Test
    void testPlayReturnsHeadsOrTails() {
        String result = answer.play();

        assertTrue(result.equals("Yes") || result.equals("No"),
                "The result should be either 'Yes' or 'No'");
    }

    @Test
    void testPlayWithDifferentLanguage() {
        answer = new SaySomething(Locale.of("pt"));
        String result = answer.play();

        assertTrue(result.equals("Sim") || result.equals("Não"),
                "The result should be either 'Sim' or 'Não' in Portuguese");
    }

}