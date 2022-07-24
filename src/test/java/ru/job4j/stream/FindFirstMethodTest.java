package ru.job4j.stream;

import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindFirstMethodTest {

    @Test
    public void test() {
        assertEquals(Optional.empty(), FindFirstMethod.first(List.of()));
        assertEquals(Optional.of(1), FindFirstMethod.first(List.of(1)));
    }
}