package com.tms.arrays.task2;

import java.util.Random;

public class Task {

    static int[] initializeRandomArray (int size) {
        int[] randomArray = new int[size];
        for (int i = 0; i < size; i++) {
            randomArray[i] = (int) (Math.random() * 10);
        }
        return randomArray;
    }

    static int findMinValue(int[] array) {
        int min = 10;
        for (int j : array) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }

    static int findMaxValue(int[] array) {
        int max = 0;
        for (int j : array) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }

    static float findAverageValue(int[] array) {
        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        return (float) sum / array.length;
    }

}
