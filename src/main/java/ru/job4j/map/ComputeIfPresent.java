package ru.job4j.map;

import java.util.Map;

public class ComputeIfPresent {

    public static Map<Integer, String> collectData(
            Map<Integer, String> name, Map<Integer, String> surname) {

        for (int id : surname.keySet()) {
            name.computeIfPresent(id, (k, v) -> v + " " + surname.get(id));
        }
        return name;
    }
}