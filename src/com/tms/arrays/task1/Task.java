package com.tms.arrays.task1;

import java.util.Random;
import java.util.stream.IntStream;

public class Task {

    static int[] initializeRandomArray(int size, int number) {
        int[] randomArray = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            randomArray[i] = rand.nextInt(number);
        }
        return randomArray;
    }

    /**
     * This method creates new array without @target element
     *
     * @param array
     * @param target
     * @return
     */
    static int[] deleteAllOccurrences(int[] array, int target) {
        if (isContains(array, target)) {
            System.out.println("There no such number in initial array!");
            return array;
        } else {
            int[] arrayInt = new int[0];
            for (int j : array) {
                if (j != target) {
                    int[] temp = arrayInt;
                    arrayInt = new int[temp.length + 1];
                    System.arraycopy(temp, 0, arrayInt, 0, temp.length);
                    arrayInt[temp.length] = j;
                }
            }
            return arrayInt;
        }
    }

    /**
     * About Stream API:
     * In this check all elements are to be converted into a sequential stream, that is returned to use .noneMatch method
     * Instead of this we can convert array to ArrayList and use .contains method or use the usual iteration in the loop
     *
     * @param array
     * @param number
     * @return
     */
    private static boolean isContains(int[] array, int number) {
        return ((IntStream.of(array)).noneMatch(x -> x == number));
    }

}
