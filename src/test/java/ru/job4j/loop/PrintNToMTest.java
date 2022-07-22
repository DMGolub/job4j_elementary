package ru.job4j.loop;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PrintNToMTest {

    @Test
    public void out2to4() {
        var out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        PrintNToM.out(2, 4);
        var expected = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add("2").add("3").toString();
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void out1to3() {
        var out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        PrintNToM.out(1, 3);
        var expected = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add("1").add("2").toString();
        assertThat(out.toString()).isEqualTo(expected);
    }
}