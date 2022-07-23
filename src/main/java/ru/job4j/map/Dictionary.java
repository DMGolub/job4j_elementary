package ru.job4j.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dictionary {

    public static Map<String, List<String>> collectData(String[] strings) {
        Map<String, List<String>> rsl = new HashMap<>();
        for (String str : strings) {
            String firstChar = str.substring(0, 1);
            rsl.putIfAbsent(firstChar, new ArrayList<String>());
            rsl.get(firstChar).add(str);
        }
        return rsl;
    }
}