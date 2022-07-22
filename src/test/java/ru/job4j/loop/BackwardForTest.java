package ru.job4j.loop;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class BackwardForTest {

    @Test
    public void test() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        BackwardFor.out(5, 1);
        String ln = System.lineSeparator();
        assertThat(out.toString()).isEqualTo("5" + ln + "4" + ln + "3" + ln + "2" + ln);
    }
}