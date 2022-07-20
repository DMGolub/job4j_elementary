package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class OddCheckTest {

    @Test
    public void test() {
        assertThat(OddCheck.check(2)).isEqualTo(false);
        assertThat(OddCheck.check(3)).isEqualTo(true);
    }
}