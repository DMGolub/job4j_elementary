package ru.job4j.hash;

import java.util.ArrayList;
import java.util.List;

public class Task3 {

    public static List<Integer> extractDuplicates(List<Integer> left, List<Integer> right) {
        List<Integer> result = new ArrayList<>();
        for (Integer num : left) {
            if (right.contains(num)) {
                result.add(num);
            }
        }
        return result;
    }
}