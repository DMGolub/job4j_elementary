package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class GreaterThenTest {

    @Test
    public void whenFirstLess() {
        assertThat(GreaterThen.check(1, 2)).isEqualTo(false);
    }

    @Test
    public void whenFirstGreat() {
        assertThat(GreaterThen.check(10, 2)).isEqualTo(true);
    }
}