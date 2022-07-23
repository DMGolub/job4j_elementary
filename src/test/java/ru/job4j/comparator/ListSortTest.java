package ru.job4j.comparator;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class ListSortTest {

    @Test
    public void test() {
        List<String> input = Arrays.asList(null, "a", "b", "c");
        List<String> result = ListSort.sort(input);
        List<String> expected = Arrays.asList("c", "b", "a", null);
        assertThat(expected).isEqualTo(result);
    }
}