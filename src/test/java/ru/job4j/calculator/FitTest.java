package ru.job4j.calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class FitTest {

    @Test
    public void when_manHeight180_thenManWeight92() {
        short in = 180;
        double expected = 92;
        double out = Fit.manWeight(in);
        double delta = 0.01;
        assertThat(out).isCloseTo(expected, offset(delta));
    }

    @Test
    public void when_womanHeight170_thenWomanWeight69() {
        short in = 170;
        double expected = 69;
        double out = Fit.womanWeight(in);
        double delta = 0.01;
        assertThat(out).isCloseTo(expected, offset(delta));
    }
}