/**
 * 6. Создайте массив строк. Заполните его произвольными именами людей.
 * Отсортируйте массив.
 * Результат выведите на консоль.
 */

package com.tms.arrays.task6;

import com.tms.handler.InputHandler;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter a list of names in one line: ");
        String[] namesArray = InputHandler.inputNamesArrayString();
        System.out.println("Your array: ".concat(Arrays.toString(namesArray)));
        System.out.println("Sorted array: ".concat(Arrays.toString(Task.sortNames(namesArray))));
    }

}
