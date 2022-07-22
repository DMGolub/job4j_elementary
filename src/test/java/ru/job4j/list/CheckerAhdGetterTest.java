package ru.job4j.list;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

class CheckerAhdGetterTest {

    @Test
    public void whenGetNull() {
        List<String> list = new ArrayList<>();
        String result = CheckerAhdGetter.getElement(list);
        String expected = "";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenGetFirstElement() {
        List<String> list = new ArrayList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        String result = CheckerAhdGetter.getElement(list);
        String expected = "first";
        assertThat(result).isEqualTo(expected);
    }
}