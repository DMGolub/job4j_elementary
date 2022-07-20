package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class EvenCheckTest {

    @Test
    public void test() {
        assertThat(EvenCheck.check(2)).isEqualTo(true);
        assertThat(EvenCheck.check(3)).isEqualTo(false);
    }
}