package ru.job4j.array;

public class SumWithStopEl {

    public static int count(int[] data, int el) {
        int summ = 0;
        int i = 0;
        while (data[i] != el) {
            summ += data[i];
            ++i;
        }
        return summ % 2 == 0 ? summ : 0;
    }
}