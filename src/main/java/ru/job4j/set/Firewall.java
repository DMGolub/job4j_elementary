package ru.job4j.set;

import java.util.Set;

public class Firewall {

    public static String checkName(String s, Set<String> words) {
        String temp = new String(s);
        temp.toLowerCase();
        String[] headerWords = temp.split(" ");
        for (int i = 0; i < headerWords.length; ++i) {
            if (words.contains(headerWords[i])) {
                return "Выберите другую статью...";
            }
        }
        return "Вы сделали правильный выбор!";
    }
}