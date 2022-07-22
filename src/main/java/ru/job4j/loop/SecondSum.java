package ru.job4j.loop;

public class SecondSum {

    public static int sum(int a, int b) {
        int result = 0;
        for (; a <= b; a += 2) {
            result += a;
        }
        return result;
    }
}