package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SecondSumTest {

    @Test
    public void test() {
        assertEquals(1, SecondSum.sum(1, 2));
        assertEquals(4, SecondSum.sum(1, 3));
        assertEquals(4, SecondSum.sum(1, 4));
        assertEquals(9, SecondSum.sum(1, 5));
        assertEquals(12, SecondSum.sum(0, 6));
    }
}