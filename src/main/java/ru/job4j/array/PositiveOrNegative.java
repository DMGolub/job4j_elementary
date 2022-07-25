package ru.job4j.array;

public class PositiveOrNegative {

    public static boolean check(int[] data) {
        int negativeCount = 0;
        for (int i = 0; i < data.length; ++i) {
            if (data[i] < 0) {
                ++negativeCount;
            }
        }
        return negativeCount % 2 != 0;
    }
}