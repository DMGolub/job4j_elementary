package ru.job4j.stream;

import java.util.List;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlatMapForObjectTest {

    @Test
    public void test() {
        assertEquals(
                List.of(1, 2, 3, 4),
                FlatMapForObject.flatMap(List.of(
                        List.of(1, 2),
                        List.of(3, 4)
                ))
        );
    }
}