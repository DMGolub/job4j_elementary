package ru.job4j.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;
import ru.job4j.map.ComputeIfAbsent.User;

import static org.assertj.core.api.Assertions.*;

class ComputeIfAbsentTest {

    @Test
    public void collectData() {
        Map<Integer, String> names = new HashMap<>(Map.of(1, "", 2, ""));
        List<User> users = List.of(
                new User(1, "name1"),
                new User(2, "name2"),
                new User(3, "name3"),
                new User(4, "name4")
        );
        Map<Integer, String> rsl = ComputeIfAbsent.collectData(names, users);
        Map<Integer, String> expected = Map.of(
                4, "name4", 1, "name1", 2, "name2", 3, "name3");
        assertThat(rsl).isEqualTo(expected);
    }
}