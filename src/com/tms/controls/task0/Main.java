/**
 * Управляющие конструкции
 * 0. Написать программу для вывода названия поры года по номеру месяца.
 * При решении используйте оператор switch-case.
 */
package com.tms.controls.task0;

import com.tms.handler.InputHandler;

public class Main {

    public static void main(String[] args) {
        Task.printTimeOfYearByMonthNumber(InputHandler.inputMonthNumber());
    }

}
