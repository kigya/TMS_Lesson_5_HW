/**
 * 7.Реализуйте алгоритм сортировки пузырьком.
 */

package com.tms.arrays.task7;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = Task.initializeRandomArray(10);
        System.out.println("Initial array: ".concat(Arrays.toString(array)));
        System.out.println("Bubble sort: "
                .concat(Arrays.toString(Task.bubbleSort(array))));
    }

}
