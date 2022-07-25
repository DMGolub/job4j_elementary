package ru.job4j.array;

public class UnionThreeArrays {

    public static int[] union(int[] left, int[] middle, int[] right) {
        int[] result = new int[middle.length / 2 + right.length / 2 + 2];
        result[0] = left[0];
        result[result.length - 1] = left[left.length - 1];
        for (int i = 1; i < middle.length; i += 2) {
            result[i + 1] = middle[i];
        }
        for (int j = 1; j < right.length; j += 2) {
            result[j] = right[j - 1];
        }
        return result;
    }
}