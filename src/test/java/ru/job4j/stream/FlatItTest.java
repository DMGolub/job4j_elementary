package ru.job4j.stream;

import java.util.Iterator;
import java.util.List;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class FlatItTest {

    @Test
    public void whenIt() {
        Iterator<Iterator<Integer>> it = List.of(
                List.of(1).iterator(),
                List.of(2, 3).iterator()
        ).iterator();
        assertThat(FlatIt.flatten(it)).isEqualTo(List.of(1, 2, 3));
    }
}