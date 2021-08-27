/**
 * 2. Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует все числа от 1 до введенного пользователем числа.
 * Для ввода числа воспользуйтесь классом Scanner.
 */

package com.tms.loops.task2;

import com.tms.handler.InputHandler;

public class Main {

    public static void main(String[] args) {
        System.out.println(Task.printNumbersFromOnetoInput(InputHandler.inputIntPositiveField()));
    }

}
