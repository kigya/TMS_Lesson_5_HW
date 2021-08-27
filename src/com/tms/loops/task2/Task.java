package com.tms.loops.task2;

public class Task {

    static int printNumbersFromOnetoInput(int input) {
        int sum = 0;
        for (int i = 1; i <= input; i++) {
            sum += i;
        }
        return sum;
    }
}
