package ru.job4j.first;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class PrintTest {

    @Test
    public void test() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Print.main(null);
        assertThat(out.toString()).isEqualTo("Сегодня я молодец!");
    }
}