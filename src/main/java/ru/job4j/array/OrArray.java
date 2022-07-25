package ru.job4j.array;

import java.util.Arrays;

public class OrArray {

    public static int[] or(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int size = left.length;
        for (int i = 0; i < left.length; ++i) {
            result[i] = left[i];
        }
        for (int j = 0; j < right.length; ++j) {
            boolean isFound = false;
            for (int k = 0; k < left.length; ++k) {
                if (right[j] == left[k]) {
                    isFound = true;
                    break;
                }
            }
            if (!isFound) {
                result[size++] = right[j];
            }
        }
        return Arrays.copyOf(result, size);
    }
}