package com.tms.arrays.task0;

import java.util.Random;

public class Task {

    static int[] initializeRandomArray (int size) {
        int[] randomArray = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            randomArray[i] = rand.nextInt(21);
        }
        return randomArray;
    }

    static boolean inConsistsNumber(int[] array, int number) {
        for (int j : array) {
            if (j == number) {
                return true;
            }
        }
        return false;
    }

}
