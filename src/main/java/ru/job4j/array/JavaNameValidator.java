package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean valid = true;
        if (name.isEmpty() || Character.isDigit(name.codePointAt(0)) || Character.isUpperCase(name.codePointAt(0))) {
            valid = false;
        }
        for (int i = 0; i < name.length(); i++) {
            int codePoint = name.codePointAt(i);
            if (isUpperLatinLetter(codePoint)) {
                valid = false;
                break;
            }
            if (isLowerLatinLetter(codePoint) || isSpecialSymbol(codePoint)) {
                valid = true;
                break;
            }
        }
        return valid;
    }

    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
    }

    public static boolean isUpperLatinLetter(int code) {
        return code >= 65 && code <= 90;
    }

    public static boolean isLowerLatinLetter(int code) {
        return code >= 97 && code <= 122;
    }
}