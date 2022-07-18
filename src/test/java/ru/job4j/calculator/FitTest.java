package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void when_manHeight180_thenManWeight92() {
        short in = 180;
        double expected = 92;
        double out = Fit.manWeight(in);
        float delta = 0.01f;
        Assert.assertEquals(expected, out, delta);
    }

    @Test
    public void when_womanHeight170_thenWomanWeight69() {
        short in = 170;
        double expected = 69;
        double out = Fit.womanWeight(in);
        float delta = 0.01f;
        Assert.assertEquals(expected, out, delta);
    }
}