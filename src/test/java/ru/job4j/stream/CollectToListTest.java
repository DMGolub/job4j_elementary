package ru.job4j.stream;

import java.util.List;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CollectToListTest {

    @Test
    public void test() {
        List<Integer> input = List.of(1, 2);
        List<Integer> expect = List.of(1, 2);
        assertEquals(expect, CollectToList.collect(input.stream()));
    }
}