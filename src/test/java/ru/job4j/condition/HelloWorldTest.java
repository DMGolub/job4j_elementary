package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class HelloWorldTest {

    @Test
    public void checkNumberHelloWorld() {
        String s = HelloWorld.checkNumber(15);
        assertThat(s).isEqualTo("Hello, World!!!");
    }

    @Test
    public void checkNumberHello() {
        String s = HelloWorld.checkNumber(9);
        assertThat(s).isEqualTo("Hello");
    }

    @Test
    public void checkNumberWorld() {
        String s = HelloWorld.checkNumber(25);
        assertThat(s).isEqualTo("World");
    }

    @Test
    public void checkNumberDefault() {
        String s = HelloWorld.checkNumber(14);
        assertThat(s).isEqualTo("Operation is not supported");
    }
}