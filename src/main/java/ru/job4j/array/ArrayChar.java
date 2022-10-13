package ru.job4j.array;

public class ArrayChar {

    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int i = 0; i < pref.length; i++) {
            for (int j = 0; j < word.length; j++) {
                if (pref[i] != word[i]) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}