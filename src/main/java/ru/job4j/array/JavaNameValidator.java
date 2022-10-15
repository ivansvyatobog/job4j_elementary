package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean valid = true;
        if (name.isEmpty() || Character.isDigit(name.codePointAt(0)) || Character.isUpperCase(name.codePointAt(0))) {
            valid = false;
        } else {
            for (int i = 1; i < name.length(); i++) {
                int codePoint = name.codePointAt(i);
                if (isLowerLatinLetter(codePoint) || isUpperLatinLetter(codePoint) || isSpecialSymbol(codePoint)) {
                    valid = true;
                }
            }
        }
        return valid;
    }

    public static boolean isSpecialSymbol(int code) {
        if (code == 36 || code == 95) {
            return true;
        }
        return false;
    }

    public static boolean isUpperLatinLetter(int code) {
            if (code >= 65 && code <= 90) {
                return true;
            }
        return false;
    }

    public static boolean isLowerLatinLetter(int code) {
            if (code >= 97 && code <= 122) {
                return true;
            }
        return false;
    }
}