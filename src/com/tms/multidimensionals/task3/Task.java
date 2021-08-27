package com.tms.multidimensionals.task3;

public class Task {

    static int findArraySum(int[][] array, int size) {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                sum += array[i][j];
            }
        }
        return sum;
    }
}
