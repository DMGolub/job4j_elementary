package ru.job4j.stream;

import java.util.Comparator;
import java.util.List;

public class MinMethod {

    public static String min(List<String> list) {
        return list.stream()
                .min((s1, s2) -> Integer.compare(s1.length(), s2.length())).get();
    }
}