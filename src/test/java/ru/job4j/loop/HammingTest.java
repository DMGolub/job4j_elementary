package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class HammingTest {

    @Test
    public void checkStringsIs3() {
        int rsl = Hamming.checkStrings("2173896", "2233796");
        assertThat(rsl).isEqualTo(3);
    }

    @Test
    public void checkStringsIs5() {
        int rsl = Hamming.checkStrings("abcde", "bcdef");
        assertThat(rsl).isEqualTo(5);
    }

    @Test
    public void checkStringsIs0() {
        int rsl = Hamming.checkStrings("abcde", "abcde");
        assertThat(rsl).isEqualTo(0);
    }
}