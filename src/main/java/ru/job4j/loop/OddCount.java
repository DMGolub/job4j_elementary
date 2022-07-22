package ru.job4j.loop;

public class OddCount {

    public static int count(int a, int b) {
        int counter = 0;
        for (; a <= b; ++a) {
            if (a % 2 != 0) {
                ++counter;
            }
        }
        return counter;
    }
}