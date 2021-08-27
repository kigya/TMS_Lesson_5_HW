package com.tms.arrays.task5;

public class Task {

    static int[] changeElementsValuesWithOddIndexesByZero(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                array[i] = 0;
            }
        }
        return array;
    }

}
