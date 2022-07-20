package ru.job4j.type;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class ShortTypeTest {

    @Test
    public void whenEnter4() {
        ByteArrayInputStream in = new ByteArrayInputStream("4".getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        System.setIn(in);
        ShortType.main(null);
        assertThat(out.toString()).isEqualTo("4" + System.lineSeparator());
    }

    @Test
    public void whenEnter5() {
        ByteArrayInputStream in = new ByteArrayInputStream("5".getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        System.setIn(in);
        ShortType.main(null);
        assertThat(out.toString()).isEqualTo("5" + System.lineSeparator());
    }
}