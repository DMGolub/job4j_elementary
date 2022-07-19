package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class SqAreaTest {

    @Test
    public void when_P6K2_thenSquare2() {
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        int expected = 2;
        double delta = 0.01;
        assertThat(out).isCloseTo(expected, offset(delta));
    }

    @Test
    public void when_P0K0_thenSquare0() {
        int p = 0;
        double k = 0;
        double out = SqArea.square(p, k);
        int expected = 0;
        double delta = 0.01;
        assertThat(out).isCloseTo(expected, offset(delta));
    }

    @Test
    public void when_P4K1_thenSquare1() {
        int p = 4;
        double k = 1;
        double out = SqArea.square(p, k);
        int expected = 1;
        double delta = 0.01;
        assertThat(out).isCloseTo(expected, offset(delta));
    }
}