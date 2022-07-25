package ru.job4j.array;

import java.util.Arrays;

public class DiffArray {

    public static int[] diff(int[] left, int[] right) {
        int[] result = new int[left.length];
        int size = 0;
        for (int i = 0; i < left.length; ++i) {
            boolean isFound = false;
            for (int j = 0; j < right.length; ++j) {
                if (left[i] == right[j]) {
                    isFound = true;
                    break;
                }
            }
            if (!isFound) {
                result[size++] = left[i];
            }
        }
        return Arrays.copyOf(result, size);
    }
}