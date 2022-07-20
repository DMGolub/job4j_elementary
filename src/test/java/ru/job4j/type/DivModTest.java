package ru.job4j.type;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.*;

class DivModTest {

    @Test
    public void test() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        DivMod.main(null);
        String ln = System.lineSeparator();
        assertThat(out.toString()).isEqualTo("3" + ln + "2" + ln);
    }
}