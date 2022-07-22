package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CryptographyTest {

    @Test
    public void codeLengthGreat4() {
        String code = Cryptography.code("4556364607935616");
        assertThat(code).isEqualTo("############5616");
    }

    @Test
    public void codeLengthLess4() {
        String code = Cryptography.code("123");
        assertThat(code).isEqualTo("123");
    }

    @Test
    public void codeEmptyString() {
        String code = Cryptography.code("");
        assertThat(code).isEqualTo("empty");
    }
}