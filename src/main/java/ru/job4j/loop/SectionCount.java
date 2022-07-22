package ru.job4j.loop;

public class SectionCount {

    public static int count(int length, int section) {
        int counter = 0;
        while (length >= section) {
            length -= section;
            ++counter;
        }
        return counter;
    }
}