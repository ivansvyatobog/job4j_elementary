package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ArrayCharTest {
    @Test
    public void whenStartWithPrefixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'e'};
        boolean result = ArrayChar.startsWith(word, pref);
        assertThat(result).isTrue();
    }

    @Test
    public void whenNotStartWithPrefixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'i'};
        boolean result = ArrayChar.startsWith(word, pref);
        assertThat(result).isFalse();
    }

    @Test
    public void whenNotStartWithPrefixThenFalse2() {
        char[] word = {'W', 'r', 'o', 'n', 'g'};
        char[] pref = {'H', 'i'};
        boolean result = ArrayChar.startsWith(word, pref);
        assertThat(result).isFalse();
    }

    @Test
    public void whenStartWithPrefixThenTrue2() {
        char[] word = {'R', 'i', 'g', 'h', 'i'};
        char[] pref = {'R', 'i'};
        boolean result = ArrayChar.startsWith(word, pref);
        assertThat(result).isTrue();
    }
}