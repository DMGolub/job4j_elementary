package ru.job4j.array;

public class EvenSumElements {

    public static boolean checkArray(int[] data) {
        int summ = 0;
        for (int i = 0; i < data.length; ++i) {
            summ += data[i];
        }
        return summ % 2 == 0;
    }
}