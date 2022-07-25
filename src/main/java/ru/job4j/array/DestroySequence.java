package ru.job4j.array;

public class DestroySequence {

    public static char[] destroy(char[] seq) {
        for (int i = 0; i < 5; ++i) {
            seq[i] = '0';
        }
        for (int j = seq.length - 1; j > seq.length - 6; --j) {
            seq[j] = '1';
        }
        return seq;
    }
}