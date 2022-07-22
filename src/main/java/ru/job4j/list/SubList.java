package ru.job4j.list;

import java.util.List;

public class SubList {

    public static List<String> getElementsBetweenIndexes(List<String> list, String el) {
        int firstIndex = list.indexOf(el);
        int lastIndex = list.lastIndexOf(el);
        if (firstIndex != -1 && lastIndex != -1) {
            return list.subList(firstIndex, lastIndex);
        }
        list.clear();
        return list;
    }
}