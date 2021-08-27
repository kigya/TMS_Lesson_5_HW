/**
 * 4. Создайте двумерный массив.  Выведите на консоль диагонали массива.
 */

package com.tms.multidimensionals.task4;

import com.tms.handler.InputHandler;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[][] array = InputHandler.initializeTwoDimensionalArray(4);
        System.out.println(Arrays.deepToString(array));
        Task.printPrincipalDiagonal(array, 4);
        Task.printSecondaryDiagonal(array, 4);
    }

}
