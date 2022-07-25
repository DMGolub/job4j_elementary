package ru.job4j.array;

import java.util.Arrays;

public class ArrayWithoutEvenElements {

    public static int[] changeData(int[] data) {
        int[] temp = new int[data.length];
        int index = 0;
        for (int i = 0; i < data.length; ++i) {
            if (data[i] % 2 != 0) {
                temp[index++] = data[i];
            }
        }
        return Arrays.copyOf(temp, index);
    }
}