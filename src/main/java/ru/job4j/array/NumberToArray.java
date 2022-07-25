package ru.job4j.array;

import java.util.Arrays;

public class NumberToArray {

    public static int[] resolve(int number) {
        int length = String.valueOf(number).length();
        int[] result = new int[length];
        for (int i = 0; i < length; ++i) {
            result[i] = number % 10;
            number /= 10;
        }
        return result;
    }
}