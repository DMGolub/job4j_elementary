package ru.job4j.array;

import java.util.Arrays;

public class Split {

    public static char[][] split(char[] str, char c) {
        char[][] result = new char[str.length / 2][];
        int fromIndex = 0;
        int commonCount = 0;
        for (int i = 0; i < str.length; ++i) {
            if (str[i] == c) {
                result[commonCount++] = Arrays.copyOfRange(str, fromIndex, i);
                fromIndex = i + 1;
            }
        }
        if (fromIndex < str.length - 1) {
            result[commonCount++] = Arrays.copyOfRange(str, fromIndex, str.length);
        }
        return Arrays.copyOf(result, commonCount);
    }
}