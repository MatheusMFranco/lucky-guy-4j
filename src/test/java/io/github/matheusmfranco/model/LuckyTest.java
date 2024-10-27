package io.github.matheusmfranco.model;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Locale;
import java.util.MissingResourceException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class LuckyTest {

  private static final Locale DEFAULT_LOCALE = Locale.ENGLISH;

  private enum MockedEnum implements Lucky {
    GOOD_LUCK,
    BAD_LUCK
  }

  @Test
  void testFetchTranslation_SuccessfulTranslation() {
    String translation = Coin.HEADS.fetchTranslation(DEFAULT_LOCALE);
    assertEquals("Heads", translation);
  }

  @Test
  void testFetchTranslation_MissingTranslation() {
    assertThrows(
        MissingResourceException.class,
        () -> MockedEnum.GOOD_LUCK.fetchTranslation(DEFAULT_LOCALE));
    assertThrows(
        MissingResourceException.class, () -> MockedEnum.BAD_LUCK.fetchTranslation(DEFAULT_LOCALE));
  }

  @Test
  void testFetchTranslation_NotAnEnum() {
    class NotAnEnumClass implements Lucky {}
    Lucky notAnEnum = new NotAnEnumClass();

    UnsupportedOperationException exception =
        assertThrows(
            UnsupportedOperationException.class, () -> notAnEnum.fetchTranslation(DEFAULT_LOCALE));

    assertEquals("Method only supported for enums", exception.getMessage());
  }
}
