package ru.job4j.type;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class IntegerTypeConversionTest {

    @Test
    public void testOut() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        IntegerTypeConversion.main(null);
        String ln = System.lineSeparator();
        assertThat(out.toString()).isEqualTo("1" + ln + "1" + ln);
    }
}