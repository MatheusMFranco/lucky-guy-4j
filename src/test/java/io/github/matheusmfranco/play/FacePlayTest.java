package io.github.matheusmfranco.play;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import io.github.matheusmfranco.model.LuckyTest;

import java.util.List;
import java.util.Locale;
import static org.junit.jupiter.api.Assertions.*;

class FacePlayTest {

    private FacePlayTestImplementation facePlay;

    static class FacePlayTestImplementation extends FacePlay {
        public FacePlayTestImplementation(Locale language) {
            super(language);
        }

        @Override
        public String play() {
            return "test";
        }
    }

    @BeforeEach
    public void setUp() {
        facePlay = new FacePlayTestImplementation(Locale.ENGLISH);
    }

    @Test
    void testCustomLuck_withValidList() {
        List<String> sides = List.of("One", "Two", "Three");
        String result = facePlay.customLuck(sides);
        assertTrue(sides.contains(result), "Result should be one of the elements from the sides list");
    }

    @Test
    void testCustomLuck_withEmptyList() {
        List<String> emptyList = List.of();
        assertThrows(IndexOutOfBoundsException.class, () -> facePlay.customLuck(emptyList),
                "Should throw IndexOutOfBoundsException for an empty list");
    }

    @Test
    void testToSides_withEnumTranslationInEnglish() {
        String result = facePlay.toSides(LuckyTest.class);
        List<String> expectedTranslations = List.of("One", "Two");
        assertTrue(expectedTranslations.contains(result), "Result should be a translated option from the enum");
    }

    @Test
    void testToSides_withEnumTranslationInPortuguese() {
        facePlay = new FacePlayTestImplementation(Locale.of("pt", "BR"));
        String result = facePlay.toSides(LuckyTest.class);
        List<String> expectedTranslations = List.of("Um", "Dois");
        assertTrue(expectedTranslations.contains(result), "Result should be a translated option from the enum in Portuguese");
    }
}
