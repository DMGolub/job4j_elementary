package ru.job4j.comparator;

import java.util.Map;
import java.util.TreeMap;
import java.util.Comparator;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SortMapTest {

    @Test
    public void test() {
        Map<Integer, String> input = Map.of(
                1, "1",
                2, "2",
                3, "3"
        );
        Map<Integer, String> expected = new TreeMap<>(Comparator.reverseOrder());
        expected.putAll(input);
        Map<Integer, String> result = SortMap.sort(input);
        assertThat(expected).isEqualTo(result);
    }
}