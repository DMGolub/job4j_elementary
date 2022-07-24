package ru.job4j.lambda;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MethodReferenceTest {

    @Test
    public void whenByClass() {
        PrintStream before = System.out;
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(buffer);
        System.setOut(out);
        MethodReference.applyByClass();
        assertThat("From class: Hello").isEqualTo(buffer.toString());
        System.setOut(before);
    }

    @Test
    public void whenByInstance() {
        PrintStream before = System.out;
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(buffer);
        System.setOut(out);
        new MethodReference().applyByInstance();
        assertThat("From instance: Hello").isEqualTo(buffer.toString());
        System.setOut(before);
    }
}