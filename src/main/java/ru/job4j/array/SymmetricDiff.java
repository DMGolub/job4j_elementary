package ru.job4j.array;

import java.util.Arrays;

public class SymmetricDiff {

    public static int[] diff(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int count = 0;
        for (int i = 0; i < left.length; ++i) {
            boolean isFound = false;
            for (int j = 0; j < right.length; ++j) {
                if (left[i] == right[j]) {
                    isFound = true;
                    break;
                }
            }
            if (!isFound) {
                result[count++] = left[i];
            }
        }
        for (int i = 0; i < right.length; ++i) {
            boolean isFound = false;
            for (int j = 0; j < left.length; ++j) {
                if (right[i] == left[j]) {
                    isFound = true;
                    break;
                }
            }
            if (!isFound) {
                result[count++] = right[i];
            }
        }
        return Arrays.copyOf(result, count);
    }
}