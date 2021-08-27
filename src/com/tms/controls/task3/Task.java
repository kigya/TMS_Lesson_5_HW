package com.tms.controls.task3;

public class Task {

    static void printWeather(double t) {
        if (t > 5) {
            System.out.println("Warm");
        } else if (t <= 5 && t > -20) {
            System.out.println("Norm");
        } else {
            System.out.println("Cold");
        }
    }
}
