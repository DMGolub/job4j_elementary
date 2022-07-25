package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SumWithStopElTest {

    @Test
    public void countNotEven() {
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int rsl = SumWithStopEl.count(data, 7);
        assertThat(rsl).isEqualTo(0);
    }

    @Test
    public void countEven() {
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int rsl = SumWithStopEl.count(data, 5);
        assertThat(rsl).isEqualTo(10);
    }
}