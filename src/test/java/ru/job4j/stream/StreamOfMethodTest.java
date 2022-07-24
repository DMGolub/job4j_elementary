package ru.job4j.stream;

import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StreamOfMethodTest {

    @Test
    public void whenUserStreamMethod() {
        assertEquals("abc", StreamOfMethod.createStream()
                .map(Object::toString).collect(Collectors.joining()));
    }
}