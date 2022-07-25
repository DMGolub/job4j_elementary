package ru.job4j.array;

import java.util.StringJoiner;

public class WordsToText {

    public static String convert(String[] words) {
        StringJoiner result = new StringJoiner(" ");
        for (int i = 0; i < words.length; ++i) {
            result.add(words[i]);
        }
        return result.toString();
    }
}