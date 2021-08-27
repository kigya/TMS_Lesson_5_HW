/**
 * 5. Создайте и заполните массив.
 * Выведите массив на экран в строку.
 * Замените каждый элемент с нечётным индексом на ноль.
 * Снова выведете массив на экран на отдельной строке.
 */

package com.tms.arrays.task5;

import com.tms.handler.InputHandler;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter an array of any length in one line: ");
        int[] array = InputHandler.inputSequenceArrayInt();
        System.out.println("Initial array: ".concat(Arrays.toString(array)));
        System.out.println("New array: "
                .concat(Arrays.toString(Task.changeElementsValuesWithOddIndexesByZero(array))));
    }

}
