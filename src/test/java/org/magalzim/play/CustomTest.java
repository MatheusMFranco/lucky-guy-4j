package org.magalzim.play;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

class CustomTest {

    @Test
    void testPlayReturnsElementFromList() {
        List<String> options = Arrays.asList("Option1", "Option2", "Option3");
        Custom custom = new Custom(options);

        String result = custom.play();

        assertTrue(options.contains(result), "The result should be one of the options in the list");
    }

    @Test
    void testPlayWithSingleElement() {
        List<String> singleOption = List.of("OnlyOption");
        Custom custom = new Custom(singleOption);

        String result = custom.play();
        assertEquals("OnlyOption", result, "The result should be 'OnlyOption' because it's the only element in the list");
    }

    @Test
    void testPlayWithEmptyListThrowsException() {
        List<String> emptyList = List.of();
        Custom custom = new Custom(emptyList);

        Exception exception = assertThrows(IndexOutOfBoundsException.class, custom::play);
        assertEquals("Index 0 out of bounds for length 0", exception.getMessage());
    }

    @Test
    void testRandomizeWithinBounds() {
        List<String> options = Arrays.asList("Option1", "Option2", "Option3");
        Custom custom = new Custom(options);

        for (int i = 0; i < 100; i++) {
            String result = custom.play();
            assertTrue(options.contains(result), "The result should always be a valid option from the list");
        }
    }
}
