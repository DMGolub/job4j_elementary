package ru.job4j.hash;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Task5 {

    public static List<Integer> multiAssign(List<Task> tasks) {
        Map<Integer, Integer> tasksToID = new TreeMap<>();
        for (Task task : tasks) {
            tasksToID.computeIfPresent(task.assignId, (k, v) -> v + 1);
            tasksToID.putIfAbsent(task.assignId, 1);
        }
        List<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry: tasksToID.entrySet()) {
            if (entry.getValue() > 1) {
                result.add(entry.getKey());
            }
        }
        return result;
    }

    public record Task(Integer taskId, Integer assignId) {
        // empty
    }
}