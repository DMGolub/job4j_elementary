package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class AddIndexElementTest {

    @Test
    public void addNewElementTrue() {
        List<String> list = new ArrayList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        boolean result = AddIndexElement.addNewElement(list, 1, "fourth");
        assertThat(result).isEqualTo(true);
    }

    @Test
    public void addNewElementFalse() {
        List<String> list = new ArrayList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        boolean result = AddIndexElement.addNewElement(list, 1, "second");
        assertThat(result).isEqualTo(false);
    }
}