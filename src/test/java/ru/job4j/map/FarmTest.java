package ru.job4j.map;

import java.util.Map;
import org.junit.jupiter.api.Test;
import ru.job4j.map.Farm.Animal;

import static org.assertj.core.api.Assertions.*;

class FarmTest {

    @Test
    public void sumLegs() {
        Map<Animal, Integer> data = Map.of(
                new Animal("chicken", 2), 5,
                new Animal("cow", 4), 2,
                new Animal("pig", 4), 8
        );
        int rsl = Farm.sumLegs(data);
        assertThat(rsl).isEqualTo(50);
    }
}