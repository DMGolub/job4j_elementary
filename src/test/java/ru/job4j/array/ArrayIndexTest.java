package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class ArrayIndexTest {

    @Test
    public void getFirstElement() {
        int[] in = {1, 2, 3, 4, 5};
        int expected = 1;
        int result = ArrayIndex.getFirstElement(in);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void getLastElement() {
        int[] in = {1, 2, 3, 5};
        int expected = 5;
        int result = ArrayIndex.getLastElement(in);
        assertThat(result).isEqualTo(expected);
    }
}