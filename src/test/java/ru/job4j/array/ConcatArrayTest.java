package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class ConcatArrayTest {

    @Test
    public void whenMethodReturnResultEight() {
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6, 7, 8};
        int expected = 8;
        int rsl = ConcatArray.combineSize(a, b);
        assertThat(expected).isEqualTo(rsl);
    }

    @Test
    public void whenMethodReturnResultTwelve() {
        int[] a = {1, 2, 3, 4};
        int[] b = {4, 5, 6, 7, 8, 9, 10, 11};
        int expected = 12;
        int rsl = ConcatArray.combineSize(a, b);
        assertThat(expected).isEqualTo(rsl);
    }
}