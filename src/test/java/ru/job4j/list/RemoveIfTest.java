package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class RemoveIfTest {

    @Test
    public void when() {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        list.add("six");
        list.add("seven");
        list.add("eight");
        list.add("nine");
        list.add("ten");
        List<String> expected = List.of("three", "seven", "eight");
        List<String> result = RemoveIf.sortList(list);
        assertThat(result).isEqualTo(expected);
    }
}