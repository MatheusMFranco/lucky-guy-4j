package io.github.matheusmfranco.play;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

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
    void testRandomize_withOneSide() {
        int sides = 1;
        int result = playTest.randomize(sides);
        assertEquals(0, result, "Result should always be 0 when there is only 1 side");
    }

    @Test
    void testRandomize_withInvalidSides() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            playTest.randomize(0);
        });
        assertEquals("Number of sides must be greater than 0", exception.getMessage());
    }
}
