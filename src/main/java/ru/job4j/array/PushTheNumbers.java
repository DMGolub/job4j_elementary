package ru.job4j.array;

public class PushTheNumbers {

    public static void push(int[][] array, int row, int column) {
        //int targetItem = array[row][column];
        for (int i = 0; i < column; ++i) {					// move in the row (left part)
            array[row][i] = array[row][i + 1];
        }
        for (int j = array.length - 1; j > column; --j) { 	// move in the row (right part)
            array[row][j] = array[row][j - 1];
        }
        for (int k = 0; k < row; ++k) {						// move in the column (upper part)
            array[k][column] = array[k + 1][column];
        }
        for (int m = array.length - 1; m > row; --m) {  	// move in the column (lower part)
            array[m][column] = array[m - 1][column];
        }
        array[row][column] = 0;
    }
}