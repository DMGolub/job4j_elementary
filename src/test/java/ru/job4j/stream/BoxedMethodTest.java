package ru.job4j.stream;

import java.util.List;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoxedMethodTest {

    @Test
    public void test() {
        assertEquals(
                List.of(1, 2, 3),
                BoxedMethod.boxed(new int[] {1, 2, 3})
        );
    }
}