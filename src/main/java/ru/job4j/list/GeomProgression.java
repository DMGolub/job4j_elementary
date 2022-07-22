package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

public class GeomProgression {

    public static int generateAndSum(int first, int denominator, int count) {
        int summ = first;
        for (int i = 2; i <= count; ++i) {
            summ += first * (int) Math.pow(denominator, i - 1);
        }
        return summ;
    }
}