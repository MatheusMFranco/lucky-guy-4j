package org.magalzim.model;

import java.util.Locale;
import java.util.ResourceBundle;

public interface Lucky {
    default String fetchTranslation(Locale locale) {
        if (this instanceof Enum) {
            String path = generatePath(this.getClass().getSimpleName());
            ResourceBundle bundle = ResourceBundle.getBundle(path, locale);
            return bundle.getString(((Enum<?>) this).name());
        }
        throw new UnsupportedOperationException("Method only supported for enums");
    }

    private String generatePath(String className) {
        String kebabCaseFolder = className
                .replaceAll("([a-z])([A-Z]+)", "$1-$2")
                .toLowerCase();
        return String.format("translations.%s.%sTranslations", kebabCaseFolder, className);
    }
}
