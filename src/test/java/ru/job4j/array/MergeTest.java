package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MergeTest {

    @Test
    public void whenBothEmpty() {
        int[] expected = new int[0];
        int[] result = Merge.merge(
                new int[0],
                new int[0]
        );
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenReorder() {
        int[] expected = {1, 2, 3, 4};
        int[] result = Merge.merge(
                new int[] {1, 3},
                new int[] {2, 4}
        );
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenAscOrder() {
        int[] expected = {1, 2, 3, 4};
        int[] result = Merge.merge(
                new int[] {1, 2},
                new int[] {3, 4}
        );
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenLeftLess() {
        int[] expected = {1, 2, 3, 3, 4};
        int[] result = Merge.merge(
                new int[] {1, 2, 3},
                new int[] {3, 4}
        );
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenLeftGreat() {
        int[] expected = {1, 2, 3, 4, 4};
        int[] result = Merge.merge(
                new int[] {1, 2},
                new int[] {3, 4, 4}
        );
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenLeftEmpty() {
        int[] expected = {1, 2, 3, 4};
        int[] result = Merge.merge(
                new int[] {},
                new int[] {1, 2, 3, 4}
        );
        assertThat(result).isEqualTo(expected);
    }
}