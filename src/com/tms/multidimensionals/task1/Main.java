/**
 * 1. Шахматная доска
 * Создать программу для расскаски шахматной доски с помощью цикла.
 * Создать двумерный массив String'ов 8х8.
 * С помощью циклов задать элементам циклам значения B(Black) или W(White).
 */

package com.tms.multidimensionals.task1;

public class Main {

    public static void main(String[] args) {
        String[][] chessBoard = new String[8][8];
        System.out.println(Task.printChessBoard(Task.colorizeBoard(chessBoard)));
    }

}
