package ru.job4j.list;

import java.util.List;

public class RemoveIf {

    public static List<String> sortList(List<String> list) {
        list.removeIf(item -> item.length() < 5);
        return list;
    }
}