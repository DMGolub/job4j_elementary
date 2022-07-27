package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class Article {

    public static boolean generateBy(String origin, String line) {
        Map<String, Integer> originWordsCount =
                getWordsCount(origin.replaceAll("\\p{Punct}", ""));
        Map<String, Integer> lineWordCount = getWordsCount(line);
        for (Map.Entry<String, Integer> entry : lineWordCount.entrySet()) {
            if (!originWordsCount.containsKey(entry.getKey())
                    || originWordsCount.get(entry.getKey()) < entry.getValue()) {
                return false;
            }
        }
        return true;
    }

    private static Map<String, Integer> getWordsCount(String str) {
        String[] words = str.split(" ");
        Map<String, Integer> result = new HashMap<>();
        for (String word : words) {
            result.computeIfPresent(word, (k, v) -> v + 1);
            result.putIfAbsent(word, 1);
        }
        return result;
    }
}
