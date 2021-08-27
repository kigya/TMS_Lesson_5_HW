/**
 * 5. Создайте двумерный массив целых чисел.
 * Отсортируйте элементы в строках двумерного массива по возрастанию.
 */

package com.tms.multidimensionals.task5;

import com.tms.handler.InputHandler;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[][] array = InputHandler.initializeTwoDimensionalArray(5);
        System.out.println(Arrays.deepToString(array));
        System.out.println("Sorted: "
                .concat(Arrays.deepToString(Task.sortLinesInArray(array))));
    }

}
