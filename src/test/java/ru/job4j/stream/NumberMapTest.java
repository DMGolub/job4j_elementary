package ru.job4j.stream;

import java.util.List;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberMapTest {

    @Test
    public void test() {
        List<Integer> input = List.of(2, 3, 4);
        List<Integer> expect = List.of(4, 9, 16);
        assertEquals(expect, NumberMap.map(input));
    }
}