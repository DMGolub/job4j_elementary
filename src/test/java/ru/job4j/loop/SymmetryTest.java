package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SymmetryTest {

    @Test
    public void checkTrue() {
        boolean check = Symmetry.check(1112111);
        assertThat(check).isEqualTo(true);
    }

    @Test
    public void checkFalse() {
        boolean check = Symmetry.check(123456321);
        assertThat(check).isEqualTo(false);
    }
}