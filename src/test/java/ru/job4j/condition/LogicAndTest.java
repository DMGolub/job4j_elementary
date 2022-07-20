package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class LogicAndTest {

    @Test
    public void test() {
        assertThat(LogicAnd.check(-1)).isEqualTo(false);
        assertThat(LogicAnd.check(1)).isEqualTo(false);
        assertThat(LogicAnd.check(2)).isEqualTo(true);
    }
}