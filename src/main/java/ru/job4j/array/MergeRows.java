package ru.job4j.array;

public class MergeRows {

    public static int[] merge(int[][] data) {
        int dataLength = data.length;
        int[] result = new int[dataLength * dataLength];
        for (int i = 0; i < dataLength; ++i) {
            for (int j = 0; j < dataLength; ++j) {
                result[i * dataLength + j] = data[i][j];
            }
        }
        return result;
    }
}