package com.tms.multidimensionals.task0;

public class Task {

    static int[][][] increaseAllElementsInArray(int[][][] array, int number) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                for (int k = 0; k < array.length; k++) {
                    array[i][j][k] += number;
                }
            }
        }
        return array;
    }

}
