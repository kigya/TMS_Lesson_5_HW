/**
 * 2. Создайте и заполните массив случайным числами и выведете максимальное, минимальное и среднее значение.
 * Для генерации случайного числа используйте метод Math.random().
 * Пусть будет возможность создавать массив произвольного размера.
 * Пусть размер массива вводится с консоли.
 */

package com.tms.arrays.task2;

import com.tms.handler.InputHandler;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = Task.initializeRandomArray(InputHandler.inputIntPositiveField());
        System.out.println("Array: ".concat(Arrays.toString(array)));
        System.out.println("Min value: ".concat(String.valueOf(Task.findMinValue(array))));
        System.out.println("Max value: ".concat(String.valueOf(Task.findMaxValue(array))));
        System.out.println("Average value: ".concat(String.valueOf(Task.findAverageValue(array))));
    }

}
