package ru.job4j.list;

import java.util.Arrays;
import java.util.List;

public class Alphabet {

    public static String reformat(String s) {
        List<String> chars = Arrays.asList(s.split(""));
        chars.sort((a, b) -> a.compareTo(b));
        StringBuilder result = new StringBuilder();
        chars.forEach(result::append);
        return result.toString();
    }
}