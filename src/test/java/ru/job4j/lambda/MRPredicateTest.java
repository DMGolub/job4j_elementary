package ru.job4j.lambda;

import java.util.function.Predicate;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MRPredicateTest {

    @Test
    public void test() {
        Predicate<String> predicate = MRPredicate.predicate();
        assertTrue(predicate.test(""));
        assertFalse(predicate.test("a"));
    }
}