package ru.job4j.stream;

import java.util.List;

public class ReduceMethodOneArgument {

    public static Integer reduce(List<Integer> list) {
        return list.stream().reduce((i1, i2) -> i1 * i2).get();
    }
}