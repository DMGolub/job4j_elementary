package ru.job4j.lambda;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class ConsumerAndThenTest {

    @Test
    public void test() {
        PrintStream out = System.out;
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(buffer);
        System.setOut(printStream);
        String input = "job4j";
        String expect = String.format("%s%s", input, System.lineSeparator());
        ConsumerAndThen.consumer(input).accept(input);
        assertThat(expect).isEqualTo(buffer.toString());
        System.setOut(out);
    }
}