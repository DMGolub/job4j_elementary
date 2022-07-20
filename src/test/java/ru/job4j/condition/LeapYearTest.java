package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class LeapYearTest {

    @Test
    public void checkYearFalse() {
        boolean b = LeapYear.checkYear(2019);
        assertThat(b).isEqualTo(false);
    }

    @Test
    public void checkYearFalse1() {
        boolean b = LeapYear.checkYear(1800);
        assertThat(b).isEqualTo(false);
    }

    @Test
    public void checkYearTrue() {
        boolean b = LeapYear.checkYear(2020);
        assertThat(b).isEqualTo(true);
    }

    @Test
    public void checkYearTrue1() {
        boolean b = LeapYear.checkYear(2000);
        assertThat(b).isEqualTo(true);
    }
}