package io.github.matheusmfranco.play;

import io.github.matheusmfranco.model.Lucky;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class FacePlay extends Play {

  protected Locale language;

  protected String customLuck(List<String> sides) {
    if (sides.isEmpty()) {
      throw new IndexOutOfBoundsException();
    }
    return sides.get(randomize(sides.size()));
  }

  protected <E extends Enum<E> & Lucky> String toSides(Class<E> lucky) {
    List<String> sides =
        Stream.of(lucky.getEnumConstants())
            .map(constant -> constant.fetchTranslation(language))
            .toList();
    return customLuck(sides);
  }
}
