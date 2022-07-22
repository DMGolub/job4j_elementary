package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SubListTest {

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
        list.add("three");
        list.add("ten");
    }

    @Test
    public void getElementsBetweenIndexes() {
        List<String> result = SubList.getElementsBetweenIndexes(list, "three");
        List<String> expected = List.of("three", "four", "five", "six", "seven", "eight");
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void getElementsBetweenIndexesEmptyList() {
        List<String> result = SubList.getElementsBetweenIndexes(list, "five");
        List<String> expected = List.of();
        assertThat(result).isEqualTo(expected);
    }
}