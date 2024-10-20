package io.github.matheusmfranco.model;

import java.util.Locale;

public enum LuckyTest implements Lucky {
    OPTION_ONE {
        @Override
        public String fetchTranslation(Locale locale) {
            return locale.getLanguage().equals("en") ? "One" : "Um";
        }
    },
    OPTION_TWO {
        @Override
        public String fetchTranslation(Locale locale) {
            return locale.getLanguage().equals("en") ? "Two" : "Dois";
        }
    }
}
