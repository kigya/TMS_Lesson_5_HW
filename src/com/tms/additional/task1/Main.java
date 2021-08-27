/**
 * 1. За каждый месяц банк начисляет к сумме вклада 7% от суммы. Напишите программу, в которую пользователь вводит сумму вклада и количество месяцев. А банк вычисляет конечную сумму вклада с учетом начисления процентов за каждый месяц.
 * Для вычисления суммы с учетом процентов используйте цикл for. Пусть сумма вклада будет представлять тип float.
 */

package com.tms.additional.task1;

import com.tms.handler.InputHandler;

public class Main {

    public static void main(String[] args) {
        System.out.println(Task.findFinalContribution(InputHandler.inputFloatPositiveField(),
                InputHandler.inputIntPositiveField()));
    }

}
