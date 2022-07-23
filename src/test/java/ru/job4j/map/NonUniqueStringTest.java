package ru.job4j.map;

import java.util.Map;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class NonUniqueStringTest {

    @Test
    public void checkData() {
        String[] data = {"a", "b", "a", "c", "b"};
        Map<String, Boolean> rsl = NonUniqueString.checkData(data);
        Map<String, Boolean> expected = Map.of("a", true, "b", true, "c", false);
        assertThat(rsl).isEqualTo(expected);
    }
}