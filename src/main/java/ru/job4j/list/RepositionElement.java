package ru.job4j.list;

import java.util.List;

public class RepositionElement {

    public static List<String> changePosition(List<String> list, int index) {
        String lastItem = list.remove(list.size() - 1);
        if (index < list.size()) {
            list.set(index, lastItem);
        }
        return list;
    }
}