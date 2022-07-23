package ru.job4j.comparator;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class ThenComparingMethodTest {

    @Test
    public void test() {
        ThenComparingMethod.User user1 = new ThenComparingMethod.User("C", 10);
        ThenComparingMethod.User user2 = new ThenComparingMethod.User("B", 20);
        ThenComparingMethod.User user3 = new ThenComparingMethod.User("A", 15);
        ThenComparingMethod.User user4 = new ThenComparingMethod.User("B", 11);
        ThenComparingMethod.User user5 = new ThenComparingMethod.User("A", 12);
        List<ThenComparingMethod.User> input = Arrays.asList(user1, user2, user3, user4, user5);
        List<ThenComparingMethod.User> expected = Arrays.asList(user3, user5, user2, user4, user1);
        input.sort(ThenComparingMethod.thenComparing());
        assertThat(expected).isEqualTo(input);
    }
}