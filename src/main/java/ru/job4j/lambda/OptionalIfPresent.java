package ru.job4j.lambda;

import java.util.Optional;

public class OptionalIfPresent {

    public static void ifPresent(int[] data) {
        max(data).ifPresent(m -> System.out.println("Max: " + m));
    }

    private static Optional<Integer> max(int[] data) {
        if (data.length == 0) {
            return Optional.empty();
        }
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < data.length; ++i) {
            if (data[i] > maxValue) {
                maxValue = data[i];
            }
        }
        return Optional.of(maxValue);
    }
}