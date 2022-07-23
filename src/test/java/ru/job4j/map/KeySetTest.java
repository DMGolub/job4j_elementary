package ru.job4j.map;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class KeySetTest {

    @Test
    public void main() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        KeySet.main(null);
        String ln = System.lineSeparator();
        String expected = "1 - root@root" + ln
                + "2 - local@local" + ln
                + "3 - host@host" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }
}