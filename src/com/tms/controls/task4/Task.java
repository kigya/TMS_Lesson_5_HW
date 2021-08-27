package com.tms.controls.task4;

public class Task {

    static void printRainbowColor(int colorNumber) {
        switch (colorNumber) {
            case 1:
                System.out.println("Red");
                break;
            case 2:
                System.out.println("Orange");
                break;
            case 3:
                System.out.println("Yellow");
                break;
            case 4:
                System.out.println("Green");
                break;
            case 5:
                System.out.println("Light cyan");
                break;
            case 6:
                System.out.println("Blue");
                break;
            case 7:
                System.out.println("Purple");
                break;
            default:
                System.out.println("Cannot match color!");
                break;
        }
    }

}
