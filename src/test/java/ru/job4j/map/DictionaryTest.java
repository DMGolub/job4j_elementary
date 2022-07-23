package ru.job4j.map;

import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class DictionaryTest {

    @Test
    public void collectData() {
        String[] data = {"two", "three", "four", "five", "six", "seven"};
        Map<String, List<String>> rsl = Dictionary.collectData(data);
        Map<String, List<String>> expected = Map.of(
                "s", List.of("six", "seven"),
                "t", List.of("two", "three"),
                "f", List.of("four", "five")
        );
        assertThat(rsl).isEqualTo(expected);
    }
}