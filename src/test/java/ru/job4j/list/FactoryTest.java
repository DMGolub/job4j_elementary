package ru.job4j.list;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class FactoryTest {

    @Test
    public void main() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Factory.main(null);
        String ln = System.lineSeparator();
        String expected = "first" + ln + "second"
                + ln + "third"
                + ln + "fourth"
                + ln + "fifth" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }
}