package ru.job4j.comparator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class ArraysSortWithObjectTest {

    @Test
    public void test() {
        String[] input = {"a", "b", "c"};
        String[] result = ArraysSortWithObject.sort(input);
        String[] expected = {"c", "b", "a"};
        assertThat(expected).isEqualTo(result);
    }
}