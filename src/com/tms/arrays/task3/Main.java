/**
 * 3.  Создайте 2 массива из 5 чисел.
 * Выведите массивы на консоль в двух отдельных строках.
 * Посчитайте среднее арифметическое элементов каждого массива и сообщите,
 * для какого из массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны)
 */

package com.tms.arrays.task3;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] firstArray = Task.initializeRandomArray(5);
        int[] secondArray = Task.initializeRandomArray(5);
        System.out.println("First array: ".concat(Arrays.toString(firstArray)));
        System.out.println("Second array: ".concat(Arrays.toString(secondArray)));
        System.out.println(Task.findMaxAverageValueInTwoArrays(firstArray, secondArray));
    }

}
