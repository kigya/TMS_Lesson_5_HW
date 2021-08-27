/**
 * 0. Создайте массив целых чисел. Напишите программу, которая выводит сообщение о том, входит ли заданное число в массив или нет.
 * Пусть число для поиска задается с консоли (класс Scanner).
 */

package com.tms.arrays.task0;

import com.tms.handler.InputHandler;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] randomArray = Task.initializeRandomArray(10);
        int number = InputHandler.inputIntPositiveField();
        System.out.println("Array: " + Arrays.toString(randomArray));
        System.out.println("Number: " + number);
        System.out.println("Result: " + Task.inConsistsNumber(randomArray, number));
    }

}
