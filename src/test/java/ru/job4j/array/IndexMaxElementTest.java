package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class IndexMaxElementTest {

    @Test
    public void getIndexMaxIs4() {
        int[] in = {1, 2, 3, 4, 5};
        int expected = 4;
        int rsl = IndexMaxElement.getIndexMax(in);
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    public void getIndexMaxIs0() {
        int[] in = {5, 4, 3, 2, 1};
        int expected = 0;
        int rsl = IndexMaxElement.getIndexMax(in);
        assertThat(rsl).isEqualTo(expected);
    }
}