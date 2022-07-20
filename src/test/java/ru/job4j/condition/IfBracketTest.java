package ru.job4j.condition;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class IfBracketTest {

    @Test
    public void when2ThenAB() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        IfBracket.show(2);
        String ln = System.lineSeparator();
        assertThat(out.toString()).isEqualTo("A" + ln + "B" + ln);
    }

    @Test
    public void when0ThenNoOut() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        IfBracket.show(0);
        assertThat(out.toString()).isEqualTo("");
    }
}