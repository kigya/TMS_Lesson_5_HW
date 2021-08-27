/**
 * 1. Написать программу для вывода названия поры года по номеру месяца.
 * При решении используйте оператор if-else-if.
 */
package com.tms.controls.task1;

import com.tms.handler.InputHandler;

public class Main {

    public static void main(String[] args) {
        Task.printMonthByNumber(InputHandler.inputMonthNumber());
    }

}
