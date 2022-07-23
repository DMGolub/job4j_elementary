package ru.job4j.map;

import java.util.HashMap;
import java.util.Map;

public class NonUniqueString {

    public static Map<String, Boolean> checkData(String[] strings) {
        Map<String, Boolean> result = new HashMap<>();
        for (int i = 0; i < strings.length; ++i) {
            if (result.putIfAbsent(strings[i], false) != null) {
                result.put(strings[i], true);
            }
        }
        return result;
    }
}