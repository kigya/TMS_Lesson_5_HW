/**
 * 2. Умножение двух матриц
 * Создайте два массива целых чисел размером 3х3 (две матрицы).
 * Напишите программу для умножения двух матриц.
 * Первый массив: {{1,0,0,0},{0,1,0,0},{0,0,0,0}}
 * Второй массив: {{1,2,3},{1,1,1},{0,0,0},{2,1,0}}
 * Ожидаемый результат:  1  2  3   1  1  1   0  0  0
 */
package com.tms.multidimensionals.task2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[][] firstArray = {{1,0,0,0},{0,1,0,0},{0,0,0,0}};
        int[][] secondArray = {{1,2,3},{1,1,1},{0,0,0},{2,1,0}};
        System.out.println(Arrays
                .deepToString(Task.multiplyMatrices(Task.makeNewDimension(firstArray, 4),
                                Task.makeNewDimension(secondArray, 4))));
    }

}
