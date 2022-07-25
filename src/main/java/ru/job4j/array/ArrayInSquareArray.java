package ru.job4j.array;

public class ArrayInSquareArray {

    public static int[][] convertArray(int[] array) {
        int size = (int) Math.round(Math.sqrt(array.length));
        System.err.println("Size = " + size);
        int[][] result = new int[size][size];
        for (int i = 0; i < size; ++i) {
            for (int j = 0; j < size; ++j) {
                if (i * size + j < array.length) {
                    result[i][j] = array[i * size + j];
                } else {
                    result[i][j] = 0;
                }
            }
        }
        return result;
    }
}