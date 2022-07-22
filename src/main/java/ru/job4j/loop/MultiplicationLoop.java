package ru.job4j.loop;

public class MultiplicationLoop {

    public static int mult(int a, int b) {
        int result = 1;
        for (; a <= b; ++a) {
            result *= a;
        }
        return result;
    }
}