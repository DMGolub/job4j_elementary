package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PairsCharStringTest {

    @Test
    public void checkTrue() {
        boolean rsl = PairsCharString.check("", "");
        assertThat(rsl).isEqualTo(true);
    }

    @Test
    public void checkTrue1() {
        boolean rsl = PairsCharString.check("sparkling", "groups");
        assertThat(rsl).isEqualTo(true);
    }

    @Test
    public void checkFalse() {
        boolean rsl = PairsCharString.check("booking", "grabber");
        assertThat(rsl).isEqualTo(false);
    }
}