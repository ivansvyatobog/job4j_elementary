package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortArrayWith3Elements() {
        int[] data = new int[] {3, 4, 1};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 3, 4};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortArrayWith5Elements() {
        int[] data = new int[] {3, 6, 9, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {2, 3, 5, 6, 9};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortArrayWith10Elements() {
        int[] data = new int[] {3, 4, 1, 2, 5, 6, 9, 0, 8, 7};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertThat(result).containsExactly(expected);
    }
}