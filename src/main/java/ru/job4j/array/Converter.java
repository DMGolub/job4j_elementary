package ru.job4j.array;

public class Converter {

    public static int[][] convertInSquareArray(int[][] array) {
        int itemCount = 0;
        for (int i = 0; i < array.length; ++i) {
            itemCount += array[i].length;
        }
        int[] temp = new int[itemCount];
        int index = 0;
        for (int n = 0; n < array.length; ++n) {
            for (int m = 0; m < array[n].length; ++m) {
                temp[index++] = array[n][m];
            }
        }
        index = 0;
        int resultSize = (int) Math.ceil(Math.sqrt(itemCount));
        int[][] result = new int[resultSize][resultSize];
        for (int j = 0; j < resultSize; ++j) {
            for (int k = 0; k < resultSize; ++k) {
                if (j * resultSize + k < itemCount) {
                    result[j][k] = temp[index++];
                } else {
                    result[j][k] = 0;
                }
            }
        }

        return result;
    }
}