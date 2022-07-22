package ru.job4j.list;

import java.util.List;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class ArProgressionTest {

    @Test
    public void checkDataIsNotNull() {
        List<Integer> data = List.of(
                1, 6, 11, 16, 21,
                26, 31, 36, 41, 46
        );
        int rsl = ArProgression.checkData(data);
        assertThat(rsl).isEqualTo(235);
    }

    @Test
    public void checkDataIsNull() {
        List<Integer> data = List.of(
                1, 6, 11, 15, 21,
                26, 31, 36, 41, 46
        );
        int rsl = ArProgression.checkData(data);
        assertThat(rsl).isEqualTo(0);
    }
}