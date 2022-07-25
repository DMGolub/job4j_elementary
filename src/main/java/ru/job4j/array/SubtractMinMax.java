package ru.job4j.array;

public class SubtractMinMax {

    public static int calculate(int[] ints) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < ints.length; ++i) {
            if (ints[i] < min) {
                min = ints[i];
            }
            if (ints[i] > max) {
                max = ints[i];
            }
        }
        return max - min;
    }
}