package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class DistinctForPrimitive {

    public static List<Integer> collect(int[] data) {
        return Arrays.stream(data).distinct()
                .collect(ArrayList::new, List::add, List::addAll);
    }
}