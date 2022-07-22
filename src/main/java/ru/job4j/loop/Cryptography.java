package ru.job4j.loop;

public class Cryptography {

    public static String code(String s) {
        if (s.isEmpty()) {
            return "empty";
        } else if (s.length() < 5) {
            return s;
        }
        StringBuilder result = new StringBuilder(s);
        for (int i = 0; i < s.length() - 4; ++i) {
            result.setCharAt(i, '#');
        }
        return result.toString();
    }
}