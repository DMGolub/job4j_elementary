package ru.job4j.condition;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class ShortCircuitAndTest {

    @Test
    public void test() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        ShortCircuitAnd.main(null);
        String ln = System.lineSeparator();
        assertThat(out.toString()).isEqualTo("A" + ln);
    }
}