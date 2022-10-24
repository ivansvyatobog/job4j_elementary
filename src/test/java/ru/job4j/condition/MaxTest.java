package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int first = 1;
        int second = 2;
        int result = Max.max(first, second);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax9To4Then9() {
        int first = 9;
        int second = 4;
        int result = Max.max(first, second);
        int expected = 9;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenEqualsThen7() {
        int first = 7;
        int second = 7;
        int result = Max.max(first, second);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void maxFrom3Parameters() {
        int first = 9;
        int second = 1;
        int third = 15;
        int result = Max.max(first, second, third);
        int expected = 15;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void maxFrom4Parameters() {
        int first = 7;
        int second = 7;
        int third = 5;
        int fourth = 1;
        int result = Max.max(first, second, third, fourth);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }
}