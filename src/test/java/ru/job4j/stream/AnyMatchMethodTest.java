package ru.job4j.stream;

import java.util.List;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnyMatchMethodTest {

    @Test
    public void test() {
        assertTrue(AnyMatchMethod.check(List.of("academy", "job4j")));
        assertFalse(AnyMatchMethod.check(List.of("academy", "university")));
    }
}