package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class LogicOrTest {

    @Test
    public void test() {
        assertThat(LogicOr.check(2)).isEqualTo(false);
        assertThat(LogicOr.check(1)).isEqualTo(true);
        assertThat(LogicOr.check(-2)).isEqualTo(true);
    }
}