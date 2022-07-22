package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class UniqueElementTest {

    @Test
    public void checkListTrue() {
        List<String> list = new ArrayList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        boolean result = UniqueElement.checkList(list, "second");
        assertThat(result).isEqualTo(true);
    }

    @Test
    public void checkListFalse() {
        List<String> list = new ArrayList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        list.add("second");
        list.add("fourth");
        boolean result = UniqueElement.checkList(list, "second");
        assertThat(result).isEqualTo(false);
    }

    @Test
    public void checkListNoContainsElement() {
        List<String> list = new ArrayList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        boolean result = UniqueElement.checkList(list, "fourth");
        assertThat(result).isEqualTo(false);
    }
}