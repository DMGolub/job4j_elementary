package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplicationLoopTest {

    @Test
    public void test() {
        assertEquals(0, MultiplicationLoop.mult(0, 2));
        assertEquals(2, MultiplicationLoop.mult(1, 2));
        assertEquals(6, MultiplicationLoop.mult(1, 3));
    }
}