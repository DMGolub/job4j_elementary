package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class AbbreviationTest {

    @Test
    public void collect() {
        String s = "North Atlantic Treaty Organization";
        String rsl = Abbreviation.collect(s);
        assertThat(rsl).isEqualTo("NATO");
    }

    @Test
    public void collect1() {
        String s = "Chief Executive Officer";
        String rsl = Abbreviation.collect(s);
        assertThat(rsl).isEqualTo("CEO");
    }

    @Test
    public void collect2() {
        String s = "United Nations Organization";
        String rsl = Abbreviation.collect(s);
        assertThat(rsl).isEqualTo("UNO");
    }
}