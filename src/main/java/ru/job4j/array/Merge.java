package ru.job4j.array;

public class Merge {

    public static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int leftIndex = 0;
        int rightIndex = 0;
        for (int i = 0, j = 0; i + j < left.length + right.length;) {
            if (i < left.length && left[i] < right[j]) {
                result[i + j] = left[i];
                ++i;
            } else {
                result[i + j] = right[j];
                ++j;
            }
        }
        return result;
    }
}