package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SectionCountTest {

    @Test
    public void test() {
        assertEquals(1, SectionCount.count(1, 1));
        assertEquals(2, SectionCount.count(2, 1));
        assertEquals(1, SectionCount.count(3, 2));
        assertEquals(2, SectionCount.count(4, 2));
    }
}