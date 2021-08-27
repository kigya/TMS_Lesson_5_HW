/**
 * 3. Создайте двумерный массив целых чисел.  Выведите на консоль сумму всех элементов массива.
 */

package com.tms.multidimensionals.task3;

import com.tms.handler.InputHandler;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[][] array = InputHandler.initializeTwoDimensionalArray(4);
        System.out.println(Arrays.deepToString(array));
        System.out.println("The sum of elements: "
                .concat(String.valueOf(Task.findArraySum(array, 4))));
    }

}
