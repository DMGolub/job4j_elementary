package ru.job4j.lambda;

import java.util.Optional;

public class OptionalGetAndIsPresent {

    public static int get(int[] data, int el) {
        Optional<Integer> result = indexOf(data, el);
        if (result.isPresent()) {
            return result.get();
        }
        return -1;
    }

    private static Optional<Integer> indexOf(int[] data, int el) {
        int index = -1;
        for (int i = 0; i < data.length; ++i) {
            if (data[i] == el) {
                index = i;
                break;
            }
        }
        if (index >= 0) {
            return Optional.of(index);
        }
        return Optional.empty();
    }
}