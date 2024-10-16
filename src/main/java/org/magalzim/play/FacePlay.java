package org.magalzim.play;

import lombok.Data;
import org.magalzim.model.Lucky;

import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

@Data
public abstract class FacePlay extends Play {

    protected Locale language = Locale.ENGLISH;

    protected String customLuck(List<String> sides) {
        return sides.get(randomize(sides.size()));
    }

    protected <E extends Enum<E> & Lucky>String toSides(Class<E> lucky) {
        List<String> sides = Stream.of(lucky.getEnumConstants())
                .map(constant -> constant.fetchTranslation(language))
                .toList();
        return customLuck(sides);
    }

}
