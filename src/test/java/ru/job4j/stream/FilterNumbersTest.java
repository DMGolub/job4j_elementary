package ru.job4j.stream;

import java.util.List;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilterNumbersTest {

    @Test
    public void test() {
        assertEquals(List.of(2, 4), FilterNumbers.filter(List.of(1, 2, 3, 4)));
    }
}