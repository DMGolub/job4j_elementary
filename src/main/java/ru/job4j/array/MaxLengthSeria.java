package ru.job4j.array;

public class MaxLengthSeria {

    public static int find(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        int maxAscendingLength = 1;
        int currentLength = 1;
        for (int i = 1; i < array.length; ++i) {
            if (array[i] >= array[i - 1]) {
                ++currentLength;
                if (currentLength > maxAscendingLength) {
                    maxAscendingLength = currentLength;
                }
            } else {
                currentLength = 1;
            }
        }
        return maxAscendingLength;
    }
}