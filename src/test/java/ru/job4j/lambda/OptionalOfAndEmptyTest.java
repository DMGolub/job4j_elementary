package ru.job4j.lambda;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.*;

class OptionalOfAndEmptyTest {

    @Test
    public void whenExists() {
        assertThat(Optional.of("c")).isEqualTo(
                OptionalOfAndEmpty.findValue(List.of("a", "b", "c"), "c"));
    }

    @Test
    public void whenNotExists() {
        assertThat(Optional.empty()).isEqualTo(
                OptionalOfAndEmpty.findValue(List.of("a", "b", "c"),"d"));
    }
}