package com.tms.arrays.task3;

public class Task {

    static int[] initializeRandomArray(int size) {
        int[] randomArray = new int[size];
        for (int i = 0; i < size; i++) {
            randomArray[i] = (int) (Math.random() * 10);
        }
        return randomArray;
    }

    static String findMaxAverageValueInTwoArrays(int[] lhsArray, int[] rhsArray) {
        float firstAverage = findAverageValue(lhsArray);
        float secondAverage = findAverageValue(rhsArray);
        if (firstAverage == secondAverage) {
            return "Averages are equal!";
        } else if (firstAverage > secondAverage) {
            return "The average value of the first array are greater than of the second!";
        } else {
            return "The average value of the second array are greater than of the first!";
        }
    }

    static float findAverageValue(int[] array) {
        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        return (float) sum / array.length;
    }

}
