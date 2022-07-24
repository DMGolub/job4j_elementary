package ru.job4j.lambda;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class OptionalOfNullable {

    public static Optional<String> findValue(List<String> strings, String value) {
        String result = null;
        for (String str : strings) {
            if (Objects.equals(str, value)) {
                result = str;
                break;
            }
        }
        return Optional.ofNullable(result);
    }
}