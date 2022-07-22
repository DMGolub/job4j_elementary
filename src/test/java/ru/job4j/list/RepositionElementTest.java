package ru.job4j.list;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

class RepositionElementTest {

    private List<String> list = new ArrayList<>();

    @BeforeEach
    public void setUp() {
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        list.add("six");
        list.add("seven");
        list.add("eight");
        list.add("nine");
    }

    @Test
    public void changePosition() {
        int index = 3;
        List<String> result = RepositionElement.changePosition(list, index);
        assertThat(result.size()).isEqualTo(8);
        assertThat(result.get(index)).isEqualTo("nine");
    }

    @Test
    public void changePositionNone() {
        int index = 20;
        List<String> result = RepositionElement.changePosition(list, index);
        assertThat(result.size()).isEqualTo(8);
        assertThat(result.contains("nine")).isEqualTo(false);
    }
}