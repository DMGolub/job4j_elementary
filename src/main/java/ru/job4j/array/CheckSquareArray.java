package ru.job4j.array;

public class CheckSquareArray {

    public static boolean checkArray(int[][] array) {
        boolean rsl = true;
        int standard = array.length;
        for (int i = 0; i < standard; i++) {
            if (array[i].length != standard) {
                return false;
            }
        }
        return rsl;
    }
}