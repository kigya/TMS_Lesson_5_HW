package com.tms.additional.task0;

public class Task {

    static int findFibonacciNumber(int number) {
        if (number <= 1) {
            return number;
        }
        return findFibonacciNumber(number - 1) + findFibonacciNumber(number - 2);
    }

    static void printFibonacciNumbersUpToEleven() {
        for (int i = 0; i < 11; i++) {
            System.out.print(findFibonacciNumber(i) + " ");
        }
    }
}
