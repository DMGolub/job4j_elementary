package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class BonusCupCoffeeTest {

    @Test
    public void countCup() {
        int rsl = BonusCupCoffee.countCup(7, 6);
        assertThat(rsl).isEqualTo(8);
    }

    @Test
    public void countCup1() {
        int rsl = BonusCupCoffee.countCup(213, 6);
        assertThat(rsl).isEqualTo(248);
    }
}