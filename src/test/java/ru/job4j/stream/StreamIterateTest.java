package ru.job4j.stream;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class StreamIterateTest {

    @Test
    public void test() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Integer[] data = {1, 2, 3, 4};
        StreamIterate.showArray(data);
        String ln = System.lineSeparator();
        assertThat(out.toString()).isEqualTo("1" + ln + "3" + ln);
    }
}