package ru.job4j.array;

import java.util.Arrays;

public class Anomaly {
    public static int[][] found(int[] data, int up, int down) {
        int[][] result = new int[data.length][];
        int fromIndex  = -1;
        int toIndex = -1;
        int count = 0;
        for (int i = 0; i < data.length; ++i) {
            if (data[i] <= down || data[i] >= up) {
                if (fromIndex == -1) {
                    fromIndex = i;
                }
                toIndex = i;
                if (i == data.length - 1) {
                    result[count++] = new int[] {fromIndex, toIndex};
                }
            } else {
                if (toIndex > -1) {
                    result[count++] = new int[] {fromIndex, toIndex};
                    fromIndex = -1;
                    toIndex = -1;
                }
            }
        }
        return Arrays.copyOf(result, count);
    }
}