package ru.job4j.loop;

public class Abbreviation {

    public static String collect(String s) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; ++i) {
            sb.append(words[i].charAt(0));
        }
        return sb.toString();
    }
}