package ru.job4j.array;

public class RandomDream {

    public static String random(String[] prizes, int num) {
        int length = prizes.length;
        if (num <= length) {
            return prizes[num - 1];
        }
        return prizes[(num - 1) % length];
    }
}