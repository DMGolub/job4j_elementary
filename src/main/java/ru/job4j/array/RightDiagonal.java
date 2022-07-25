package ru.job4j.array;

public class RightDiagonal {

    public static int[] diagonal(int[][] data) {
        int size = data.length;
        int[] result = new int[size];
        for (int i = 0; i < size; ++i) {
            result[i] = data[i][size - i - 1];
        }
        return result;
    }
}