package ru.job4j.set;

import java.util.HashSet;
import java.util.Set;

public class Pangram {

    private final static int ENGLISH_ALPHABET_SIZE = 26;

    public static boolean checkString(String s) {
        s = s.toLowerCase();
        Set<Character> chars = new HashSet<>();
        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            if (Character.isLetter(c)) {
                chars.add(c);
            }
        }
        return chars.size() == ENGLISH_ALPHABET_SIZE;
    }
}