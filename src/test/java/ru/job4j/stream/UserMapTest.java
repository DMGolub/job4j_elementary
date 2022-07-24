package ru.job4j.stream;

import java.util.Iterator;
import java.util.List;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserMapTest {

    @Test
    public void test() {
        List<Integer> ages = List.of(1, 2);
        List<UserMap.User> result = UserMap.map(ages);
        Iterator<UserMap.User> iterator = result.iterator();
        assertEquals(1, iterator.next().getAge());
        assertEquals(2, iterator.next().getAge());
    }
}