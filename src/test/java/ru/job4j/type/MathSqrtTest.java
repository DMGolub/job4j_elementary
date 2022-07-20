package ru.job4j.type;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MathSqrtTest {

    @Test
    public void test() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        MathSqrt.main(null);
        String ln = System.lineSeparator();
        assertThat(out.toString()).isEqualTo("3.0" + ln);
    }
}