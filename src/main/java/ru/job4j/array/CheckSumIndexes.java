package ru.job4j.array;

import java.util.Arrays;

public class CheckSumIndexes {

    public static int[] collectNewArray(int[][] data, int sum) {
        int[] result = new int[data.length * data.length];
        int index = 0;
        for (int i = 0; i < data.length; ++i) {
            for (int j = 0; j < data.length; ++j) {
                if (i + j == sum) {
                    data[i][j] = 0;
                }
                if (data[i][j] != 0) {
                    result[index++] = data[i][j];
                }
            }
        }
        return Arrays.copyOf(result, index);
    }
}