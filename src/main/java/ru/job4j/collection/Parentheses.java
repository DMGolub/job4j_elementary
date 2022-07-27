package ru.job4j.collection;

import java.util.List;
import java.util.ArrayList;

public class Parentheses {

    public static boolean valid(char[] data) {
        boolean result = true;
        List<Character> parentheses = new ArrayList<>();
        for (int i = 0; i < data.length; ++i) {
            char c = data[i];
            if (c == '(') {
                parentheses.add(c);
            } else {
                if (parentheses.size() > 0 && parentheses.get(parentheses.size() - 1) == '(') {
                    parentheses.remove(parentheses.size() - 1);
                } else {
                    result = false;
                    break;
                }
            }
        }
        if (parentheses.size() > 0) {
            result = false;
        }
        return result;
    }
}