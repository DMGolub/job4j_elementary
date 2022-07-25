package ru.job4j.array;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class EvenPrintTest {

    @Test
    public void whenNonEmpty() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        EvenPrint.print(new int[] {1, 2, 3, 4});
        String ln = System.lineSeparator();
        assertThat(out.toString()).isEqualTo("4" + ln + "2" + ln);
    }

    @Test
    public void whenEmpty() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        EvenPrint.print(new int[] {1, 3, 5});
        assertThat(out.toString()).isEqualTo("");
    }
}