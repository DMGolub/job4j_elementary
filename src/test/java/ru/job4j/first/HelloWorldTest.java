package ru.job4j.first;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class HelloWorldTest {

    @Test
    public void checkOutHelloJob4j() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        HelloWorld.main(null);
        assertThat(out.toString()).isEqualTo("Hello, Job4j!" + System.lineSeparator());
    }
}