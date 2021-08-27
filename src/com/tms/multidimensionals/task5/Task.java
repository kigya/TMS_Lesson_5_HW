package com.tms.multidimensionals.task5;

public class Task {

    static int[][] sortLinesInArray(int[][] array) {
        int b;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                for (int k = j + 1; k < array.length; k++) {
                    if (array[i][j] > array[i][k]) {
                        b = array[i][j];
                        array[i][j] = array[i][k];
                        array[i][k] = b;
                    }
                }
            }
        }
        return array;
    }
}
