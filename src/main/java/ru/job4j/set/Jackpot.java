package ru.job4j.set;

import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

public class Jackpot {

    public static boolean checkYourWin(String[] combination) {
        Set<String> elements = new HashSet<>(Arrays.asList(combination));
        return elements.size() == 1;
    }
}