/**
 * 3. Для введенного числа t (температура на улице) вывести
 * Если t>–5, то вывести «Тепло».
 * Если –5>= t > –20, то вывести «Нормально».
 * Если –20>= t, то вывести «Холодно».
 */
package com.tms.controls.task3;

import com.tms.handler.InputHandler;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter temperature: ");
        Task.printWeather(InputHandler.inputDoubleField());
    }

}
