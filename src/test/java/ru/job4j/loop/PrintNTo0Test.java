package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.assertj.core.api.Assertions.*;

class PrintNTo0Test {

    @Test
    public void out3() {
        var out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        PrintNTo0.out(3);
        var expected = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add("2").add("1").add("0").toString();
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void out2() {
        var out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        PrintNTo0.out(2);
        var expected = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add("1").add("0").toString();
        assertThat(out.toString()).isEqualTo(expected);
    }
}