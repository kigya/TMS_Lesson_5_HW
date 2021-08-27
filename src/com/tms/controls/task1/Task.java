package com.tms.controls.task1;

public class Task {

    static void printMonthByNumber(int number) {
        if (number > 6) {
            if (number > 9) {
                if (number == 10) {
                    System.out.println("October");
                } else if (number == 11) {
                    System.out.println("November");
                } else {
                    System.out.println("December");
                }
            } else if (number == 7) {
                System.out.println("July");
            } else if (number == 8) {
                System.out.println("August");
            } else {
                System.out.println("September");
            }

        } else if (number > 3) {
            if (number == 4) {
                System.out.println("April");
            } else if (number == 5) {
                System.out.println("May");
            } else {
                System.out.println("June");
            }
        } else if (number == 1) {
            System.out.println("January");
        } else if (number == 2) {
            System.out.println("February");
        } else {
            System.out.println("March");
        }
    }

}
