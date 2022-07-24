package ru.job4j.stream;

import java.util.List;

public class ReductionWithTwoArguments {

    public static Integer collect(List<Integer> list) {
        return list.stream().reduce(5, (i1, i2) -> i1 * i2);
    }
}