package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CheckSquareArrayTest {

    @Test
    public void checkArrayTrue() {
        int[][] in = new int[][]{{4, 5, 6}, {2, 3, 0}, {1, 7, 8}};
        boolean result = CheckSquareArray.checkArray(in);
        assertThat(result).isEqualTo(true);
    }

    @Test
    public void checkArrayFalse() {
        int[][] in = new int[][]{{4, 5, 6}, {2, 3}, {1}};
        boolean result = CheckSquareArray.checkArray(in);
        assertThat(result).isEqualTo(false);
    }
}