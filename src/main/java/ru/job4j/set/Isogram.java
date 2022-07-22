package ru.job4j.set;

import java.util.HashSet;
import java.util.Set;

public class Isogram {

    public static boolean checkString(String s) {
        Set<Character> chars = new HashSet<>();
        for (int i = 0; i < s.length(); ++i) {
            chars.add(s.charAt(i));
        }
        return chars.size() == s.length();
    }
}