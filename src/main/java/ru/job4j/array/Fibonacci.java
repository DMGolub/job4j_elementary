package ru.job4j.array;

public class Fibonacci {

    public static boolean checkArray(int[] data) {
        if (data.length < 3) {
            return false;
        }
        boolean rsl = true;
        for (int i = 2; i < data.length; ++i) {
            if (data[i] != data[i - 2] + data[i - 1]) {
                return false;
            }
        }
        return rsl;
    }
}