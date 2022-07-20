package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class ArithmeticActionsTest {

    @Test
    public void selectActionAdded() {
        String action = ArithmeticActions.selectAction(5, 10, 15);
        assertThat(action).isEqualTo("added");
    }

    @Test
    public void selectActionSubtracted() {
        String action = ArithmeticActions.selectAction(10, 5, 5);
        assertThat(action).isEqualTo("subtracted");
    }

    @Test
    public void selectActionMultiplied() {
        String action = ArithmeticActions.selectAction(3, 5, 15);
        assertThat(action).isEqualTo("multiplied");
    }

    @Test
    public void selectActionDivided() {
        String action = ArithmeticActions.selectAction(15, 5, 3);
        assertThat(action).isEqualTo("divided");
    }

    @Test
    public void selectActionNone() {
        String action = ArithmeticActions.selectAction(1, 10, 100);
        assertThat(action).isEqualTo("none");
    }
}