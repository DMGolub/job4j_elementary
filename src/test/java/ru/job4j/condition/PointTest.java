package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when_00To00_then0() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        double expected = 0;
        double delta = 0.01;
        Assert.assertEquals(expected, out, delta);
    }

    @Test
    public void when_00To20_then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        double expected = 2;
        double delta = 0.01;
        Assert.assertEquals(expected, out, delta);
    }

    @Test
    public void when_12To52_then4() {
        int x1 = 1;
        int y1 = 2;
        int x2 = 5;
        int y2 = 2;
        double out = Point.distance(x1, y1, x2, y2);
        double expected = 4;
        double delta = 0.01;
        Assert.assertEquals(expected, out, delta);
    }
}
