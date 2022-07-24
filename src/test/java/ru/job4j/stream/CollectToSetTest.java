package ru.job4j.stream;

import java.util.Set;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CollectToSetTest {

    @Test
    public void test() {
        Set<Integer> input = Set.of(1, 2);
        Set<Integer> expect = Set.of(1, 2);
        assertEquals(expect, CollectToSet.collect(input.stream()));
    }
}