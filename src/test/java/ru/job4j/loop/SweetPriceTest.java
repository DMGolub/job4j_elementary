package ru.job4j.loop;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SweetPriceTest {

    @Test
    public void test() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        SweetPrice.out(10);
        String ln = System.lineSeparator();
        assertThat(out.toString()).isEqualTo(
                "10" + ln + "20" + ln + "30" + ln + "40" + ln + "50" + ln);
    }
}