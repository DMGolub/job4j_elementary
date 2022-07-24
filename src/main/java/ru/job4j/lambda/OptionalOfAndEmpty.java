package ru.job4j.lambda;

import java.util.List;
import java.util.Optional;

public class OptionalOfAndEmpty {

    public static Optional<String> findValue(List<String> strings, String value) {
        int index = strings.indexOf(value);
        if (index > 0) {
            return Optional.of(strings.get(index));
        }
        return Optional.empty();
    }
}