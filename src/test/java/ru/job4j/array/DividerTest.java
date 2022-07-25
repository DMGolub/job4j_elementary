package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class DividerTest {

    @Test
    public void checkTrue() {
        int[] ints = {2, 3, 4};
        boolean check = Divider.check(12, ints);
        assertThat(check).isEqualTo(true);
    }

    @Test
    public void checkFalse() {
        int[] ints = {1, 2, 3, 6, 9, 11};
        boolean check = Divider.check(18, ints);
        assertThat(check).isEqualTo(false);
    }
}