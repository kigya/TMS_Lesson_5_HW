package com.tms.additional.task2;

public class Task {

    static void printMultiplicationTableUpToTen() {
        System.out.printf("%6s", " ");
        for (int x = 1; x < 11; x++) {
            System.out.printf("%5d", x);
        }
        System.out.println("\n     +--------------------------------------------------");
        for (int i = 1; i < 11; i++) {
            System.out.printf("%5d", i);
            System.out.printf("%1s", "|");
            for (int j = 1; j < 11; j++) {
                System.out.printf("%5d", i * j);
            }
            System.out.println("");
        }
    }

}
