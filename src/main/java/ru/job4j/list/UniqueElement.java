package ru.job4j.list;

import java.util.List;

public class UniqueElement {

    public static boolean checkList(List<String> list, String str) {
        int firstIndex = list.indexOf(str);
        if (firstIndex == -1) {
            return false;
        }
        return firstIndex == list.lastIndexOf(str);
    }
}