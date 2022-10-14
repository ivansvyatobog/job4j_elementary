package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int index = post.length - 1; index >= 0; index--) {
            if (post[post.length - index - 1] != word[word.length - index - 1]) {
                result = false;
                return result;
            }
        }
        return true;
    }
}