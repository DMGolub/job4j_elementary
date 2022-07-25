package ru.job4j.array;

public class Validator {

    public static boolean checkArray(int[] data, int value) {
        int valueCount = 0;
        for (int i = 0; i < data.length; ++i) {
            if (data[i] == value) {
                ++valueCount;
            }
        }
        return valueCount < data.length / 2;
    }
}