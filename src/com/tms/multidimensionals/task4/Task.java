package com.tms.multidimensionals.task4;

public class Task {

    static void printPrincipalDiagonal(int[][] array, int n) {
        System.out.print("Principal Diagonal: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    System.out.print(array[i][j] + ", ");
                }
            }
        }
        System.out.println();
    }

    static void printSecondaryDiagonal(int[][] array, int n) {
        System.out.print("Secondary Diagonal: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i + j) == (n - 1)) {
                    System.out.print(array[i][j] + ", ");
                }
            }
        }
        System.out.println();
    }
}
