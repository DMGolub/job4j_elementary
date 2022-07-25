package ru.job4j.array;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class OddPrintTest {

    @Test
    public void whenNonEmpty() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        OddPrint.print(new int[] {1, 2, 3});
        String ln = System.lineSeparator();
        assertThat(out.toString()).isEqualTo("1" + ln + "3" + ln);
    }

    @Test
    public void whenEmpty() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        OddPrint.print(new int[] {2, 4, 6});
        assertThat(out.toString()).isEqualTo("");
    }
}