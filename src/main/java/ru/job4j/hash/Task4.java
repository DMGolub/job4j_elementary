package ru.job4j.hash;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Task4 {

    public static List<Integer> extractUnique(List<Integer> left, List<Integer> right) {
        Map<Integer, Integer> numbersToCount = new TreeMap<>();
        countNumbers(numbersToCount, left);
        countNumbers(numbersToCount, right);
        List<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : numbersToCount.entrySet()) {
            if (entry.getValue() == 1) {
                result.add(entry.getKey());
            }
        }
        return result;
    }

    private static void countNumbers(Map<Integer, Integer> numbersToCount, List<Integer> nums) {
        for (Integer num : nums) {
            numbersToCount.computeIfPresent(num, (k, v) -> v + 1);
            numbersToCount.putIfAbsent(num, 1);
        }
    }
}