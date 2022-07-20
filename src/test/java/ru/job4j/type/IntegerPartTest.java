package ru.job4j.type;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class IntegerPartTest {

    @Test
    public void test() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        IntegerPart.main(null);
        String ln = System.lineSeparator();
        assertThat(out.toString()).isEqualTo("2" + ln);
    }
}