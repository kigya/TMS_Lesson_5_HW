/**
 * 2. Напишите программу, которая будет принимать на вход число и на выход будет выводить сообщение четное число или нет.
 * Для определения четности числа используйте операцию получения остатка от деления - операция выглядит так: '% 2').
 */

package com.tms.controls.task2;

import com.tms.handler.InputHandler;

public class Main {

    public static void main(String[] args) {
        Task.checkParity(InputHandler.inputIntField());
    }

}
