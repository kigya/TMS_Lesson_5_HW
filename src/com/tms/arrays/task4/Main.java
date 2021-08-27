/**
 * 4. Если пользователь ввёл неподходящее число, то программа должна просить пользователя повторить ввод.
 * Создайте массив из n случайных целых чисел и выведите его на экран.
 * Размер массива пусть задается с консоли и размер массива может быть больше 5 и меньше или равно 10.
 * Если n не удовлетворяет условию - выведите сообщение об этом.
 * Создайте второй массив только из чётных элементов первого массива, если они там есть, и вывести его на экран.
 */

package com.tms.arrays.task4;

import com.tms.handler.InputHandler;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = Task.initializeRandomArray(InputHandler.inputIntFieldFromFiveToTen());
        System.out.println("Your array: ".concat(Arrays.toString(array)));;
        System.out.println("Array with even elements: "
                .concat(Arrays.toString(Task.deleteAllOddOccurrences(array))));
    }

}
