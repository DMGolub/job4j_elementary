package ru.job4j.io;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringJoiner;

public class Shell {

    private Queue<String> pathQueue;

    public Shell() {
        this.pathQueue = new ArrayDeque<>();
    }

    public void cd(String path) {
        if (path.startsWith("/")) {
            pathQueue.clear();
        }
        String[] folders = path.split("/");
        for (String folder: folders) {
            System.out.println(folder);
            if (folder.equals("..")) {
                pathQueue.poll();
            } else if (!folder.isEmpty()) {
                pathQueue.add(folder);
            }
        }
    }

    public String pwd() {
        StringJoiner joiner = new StringJoiner("/");
        while (!pathQueue.isEmpty()) {
            joiner.add(pathQueue.poll());
        }
        return "/" + joiner.toString();
    }
}