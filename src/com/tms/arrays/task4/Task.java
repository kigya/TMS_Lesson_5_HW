package com.tms.arrays.task4;

public class Task {

    static int[] initializeRandomArray(int size) {
        int[] randomArray = new int[size];
        for (int i = 0; i < size; i++) {
            randomArray[i] = (int) (Math.random() * 10);
        }
        return randomArray;
    }

    static int[] deleteAllOddOccurrences(int[] array) {
        int[] arrayInt = new int[0];
        for (int j : array) {
            if (j % 2 == 0) {
                int[] temp = arrayInt;
                arrayInt = new int[temp.length + 1];
                System.arraycopy(temp, 0, arrayInt, 0, temp.length);
                arrayInt[temp.length] = j;
            }
        }
        return arrayInt;
    }

}
