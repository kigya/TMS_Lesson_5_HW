/**
 * 1. Создайте массив целых чисел. Удалите все вхождения заданного числа из массива.
 * Пусть число задается с консоли (класс Scanner). Если такого числа нет - выведите сообщения об этом.
 * В результате должен быть новый массив без указанного числа.
 */

package com.tms.arrays.task1;

import com.tms.handler.InputHandler;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = Task.initializeRandomArray(10, 10);
        int number = InputHandler.inputIntPositiveField();
        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Number: " + number);
        System.out.println("New array: "
                .concat(Arrays.toString(Task.deleteAllOccurrences(array,number))));
    }

}
