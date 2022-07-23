package ru.job4j.comparator;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CollectionsSortTest {

    @Test
    public void test() {
        List<String> input = Arrays.asList("c", "b", "a");
        List<String> expected = Arrays.asList("a", "b", "c");
        List<String> out = CollectionsSort.sort(input);
        assertThat(expected).isEqualTo(out);
    }
}