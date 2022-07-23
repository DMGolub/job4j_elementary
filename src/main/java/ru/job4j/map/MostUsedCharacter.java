package ru.job4j.map;

import java.util.*;

public class MostUsedCharacter {

    public static char getMaxCount(String str) {
        String tmp = str.toLowerCase().replace(" ", "");
        Map<Character, Integer> chars = new TreeMap<>();
        for (int i = 0; i < tmp.length(); ++i) {
            chars.putIfAbsent(tmp.charAt(i), 0);
            chars.computeIfPresent(tmp.charAt(i), (k, v) -> v + 1);
        }
        char result = ' ';
        int maxCount = 0;
        for (Map.Entry<Character, Integer> entry : chars.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                result = entry.getKey();
            }
        }
        return result;
    }
}