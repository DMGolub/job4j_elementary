package ru.job4j.list;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class GeomProgressionTest {

    @Test
    public void generateAndSum() {
        int rsl = GeomProgression.generateAndSum(1, 3, 10);
        assertThat(rsl).isEqualTo(29524);
    }

    @Test
    public void generateAndSumIs0() {
        int rsl = GeomProgression.generateAndSum(1, -1, 10);
        assertThat(rsl).isEqualTo(0);
    }
}