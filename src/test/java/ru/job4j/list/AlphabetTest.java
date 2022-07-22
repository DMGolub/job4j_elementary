package ru.job4j.list;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class AlphabetTest {

    @Test
    public void reformat() {
        String rsl = Alphabet.reformat("javascript");
        String expected = "aacijprstv";
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    public void reformat1() {
        String rsl = Alphabet.reformat("websecurityconfigureradapter");
        String expected = "aabccdeeeefgiinoprrrrsttuuwy";
        assertThat(rsl).isEqualTo(expected);
    }
}