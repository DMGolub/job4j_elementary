package ru.job4j.collection;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class ParenthesesTest {

    @Test
    public void whenValidInner() {
        assertThat(Parentheses.valid(new char[] {'(', '(', ')', ')'}))
                .isEqualTo((true));
    }

    @Test
    public void whenValidSeq() {
        assertThat(Parentheses.valid(new char[] {'(', ')', '(', ')'}))
                .isEqualTo(true);
    }

    @Test
    public void whenInValidInner() {
        assertThat(Parentheses.valid(new char[] {')', ')', '(', '('}))
                .isEqualTo(false);
    }

    @Test
    public void whenInValidSeq() {
        assertThat(Parentheses.valid(new char[] {'(', ')', '(', '('}))
                .isEqualTo(false);
    }
}