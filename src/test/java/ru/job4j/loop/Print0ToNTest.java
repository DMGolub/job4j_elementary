package ru.job4j.loop;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class Print0ToNTest {

    @Test
    public void out3() {
        var out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Print0ToN.out(3);
        var expected = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add("0").add("1").add("2").toString();
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void out2() {
        var out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Print0ToN.out(2);
        var expected = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add("0").add("1").toString();
        assertThat(out.toString()).isEqualTo(expected);
    }
}