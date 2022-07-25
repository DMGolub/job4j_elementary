package ru.job4j.array;

public class TwoSquareArrays {

    public static int[] collectArray(int[][] left, int[][] right) {
        int size = left.length;
        int[] result = new int[size * size];
        for (int i = 0; i < size; ++i) {
            for (int j = 0; j < size; ++j) {
                result[i * size + j] = Math.max(left[i][j], right[i][j]);
            }
        }
        return result;
    }
}