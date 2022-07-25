package ru.job4j.algo;

import java.util.Arrays;

public class UpperCase {

    public static char[] onlyLowCase(char[] input) {
        char[] temp = new char[input.length];
        int index = 0;
        for (int i = 0; i < input.length; ++i) {
            if (Character.isLetter(input[i]) && Character.isLowerCase(input[i])) {
                temp[index++] = Character.toUpperCase(input[i]);
            }
        }
        return Arrays.copyOf(temp, index);
    }
}