package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class LessThenTest {

    @Test
    public void whenFirstLess() {
        assertThat(LessThen.check(1, 2)).isEqualTo(true);
    }

    @Test
    public void whenFirstGreat() {
        assertThat(LessThen.check(10, 2)).isEqualTo(false);
    }
}