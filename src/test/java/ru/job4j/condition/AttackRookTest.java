package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class AttackRookTest {

    @Test
    public void checkTrue() {
        boolean check = AttackRook.check("A8", "E8");
        assertThat(check).isEqualTo(true);
    }

    @Test
    public void checkTrue1() {
        boolean check = AttackRook.check("H4", "H3");
        assertThat(check).isEqualTo(true);
    }

    @Test
    public void checkFalse() {
        boolean check = AttackRook.check("A1", "B2");
        assertThat(check).isEqualTo(false);
    }

    @Test
    public void checkFalse1() {
        boolean check = AttackRook.check("F5", "C8");
        assertThat(check).isEqualTo(false);
    }
}