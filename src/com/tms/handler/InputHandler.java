package com.tms.handler;

import java.util.Locale;
import java.util.Scanner;

/**
 * This class contains some methods for valid tasks values input
 */
public class InputHandler {

    public static int inputMonthNumber() {
        int number;
        System.out.println("Enter month number: ");
        Scanner scanner = new Scanner(System.in);
        do {
            while (!scanner.hasNextInt()) {
                System.out.println("That not a number! Try again");
                scanner.next();
            }
            number = scanner.nextInt();
        } while (!(number > 0 && number <= 12));
        return number;
    }

    public static int inputIntField() {
        int number;
        System.out.println("Enter integer: ");
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            System.out.println("That not a number! Try again");
            scanner.next();
        }
        number = scanner.nextInt();
        return number;
    }

    public static double inputDoubleField() {
        double number;
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        while (!scanner.hasNextDouble()) {
            System.out.println("That not a number! Try again");
            scanner.next();
        }
        number = scanner.nextDouble();
        return number;
    }

    public static int inputRainbowColorNumber() {
        int number;
        System.out.println("Enter rainbow color number: ");
        Scanner scanner = new Scanner(System.in);
        do {
            while (!scanner.hasNextInt()) {
                System.out.println("That not a number! Try again");
                scanner.next();
            }
            number = scanner.nextInt();
        } while (!(number > 0 && number <= 7));
        return number;
    }

    public static int inputIntPositiveField() {
        int number;
        System.out.println("Enter positive number: ");
        Scanner scanner = new Scanner(System.in);
        do {
            while (!scanner.hasNextInt()) {
                System.out.println("That not a number! Try again");
                scanner.next();
            }
            number = scanner.nextInt();
        } while (number < 0);
        return number;
    }

    public static float inputFloatPositiveField() {
        float number;
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        do {
            System.out.println("Enter positive number: ");
            while (!scanner.hasNextFloat()) {
                System.out.println("That not a number! Try again");
                scanner.next();
            }
            number = scanner.nextFloat();
        } while (number < 0);
        return number;
    }

    public static int inputIntFieldFromFiveToTen() {
        int number;
        System.out.println("Enter number in range [5, 10]: ");
        Scanner scanner = new Scanner(System.in);
        do {
            while (!scanner.hasNextInt()) {
                System.out.println("That not a number! Try again");
                scanner.next();
            }
            number = scanner.nextInt();
            if (!(number > 5 && number <= 10)) {
                System.out.println("Wrong range!");
            }
        } while (!(number > 5 && number <= 10));
        return number;
    }

    public static int[] inputSequenceArrayInt() {

        Scanner scanner = new Scanner(System.in);
        int[] arrayInt = new int[0];
        do {
            String[] string = scanner.nextLine().split(" ");
            for (String s : string) {
                if (s.matches("^-?\\d+$")) {
                    int n = Integer.parseInt(s);
                    int[] temp = arrayInt;
                    arrayInt = new int[temp.length + 1];
                    System.arraycopy(temp, 0, arrayInt, 0, temp.length);
                    arrayInt[temp.length] = n;
                }
            }
            if (arrayInt.length == 0) {
                System.out.println("Empty sequence!");
            }
        } while (arrayInt.length == 0);
        return arrayInt;
    }

    public static String[] inputNamesArrayString() {
        Scanner scanner = new Scanner(System.in);
        String[] arrayString = new String[0];
        do {
            String[] string = scanner.nextLine().split(" ");

            for (String s : string) {
                if (s.matches("[A-Z][a-z]*")) {
                    String[] temp = arrayString;
                    arrayString = new String[temp.length + 1];
                    System.arraycopy(temp, 0, arrayString, 0, temp.length);
                    arrayString[temp.length] = s;
                }
            }
            if (arrayString.length == 0) {
                System.out.println("Empty names array!");
            }
        } while (arrayString.length == 0);
        return arrayString;
    }

    public static int[][][] initializeThreeDimensionalArray(int size) {
        int[][][] array = new int[size][size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                for (int k = 0; k < size; k++) {
                    array[i][j][k] = (int) (Math.random() * 10);
                }
            }
        }
        return array;
    }

    public static int[][] initializeTwoDimensionalArray(int size) {
        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = (int) (Math.random() * 10);
            }
        }
        return array;
    }
}
