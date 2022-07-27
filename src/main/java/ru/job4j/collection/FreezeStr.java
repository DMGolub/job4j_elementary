package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class FreezeStr {

    public static boolean eq(String left, String right) {
        return getCharCount(left).equals(getCharCount(right));
    }

    private static Map<Character, Integer> getCharCount(String str) {
        Map<Character, Integer> result = new HashMap<>();
        for (char c : str.toCharArray()) {
            result.computeIfPresent(c, (k, v) -> v + 1);
            result.putIfAbsent(c, 1);
        }
        return result;
    }
}