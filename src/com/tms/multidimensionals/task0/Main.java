/**
 * 0. Создать трехмерный массив из целых чисел
 * С помощью циклов "пройти" по всему массиву и увеличить каждый элемент на заданное число.
 * Пусть число, на которое будет увеличиваться каждый элемент, задается из консоли.
 */

package com.tms.multidimensionals.task0;

import com.tms.handler.InputHandler;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[][][] array = InputHandler.initializeThreeDimensionalArray(3);
        int number = InputHandler.inputIntField();
        System.out.println("Initial array: ".concat(Arrays.deepToString(array)));
        System.out.println("New array: "
                .concat(Arrays.deepToString(Task.increaseAllElementsInArray(array, number))));
    }

}
