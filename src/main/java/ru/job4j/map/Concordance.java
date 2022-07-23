package ru.job4j.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Concordance {

    public static Map<Character, List<Integer>> collectCharacters(String s) {
        Map<Character, List<Integer>> result = new HashMap<>();
        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            if (c != ' ') {
                result.putIfAbsent(s.charAt(i), new ArrayList<>());
                result.get(c).add(i);
            }
        }
        return result;
    }
}