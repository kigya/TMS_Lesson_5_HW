package com.tms.multidimensionals.task1;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class Task {

    static String[][] colorizeBoard(String[][] array) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        array[i][j] = "W";
                    } else {
                        array[i][j] = "B";
                    }
                } else if (j % 2 == 0) {
                    array[i][j] = "B";
                } else {
                    array[i][j] = "W";
                }
            }
        }
        return array;
    }

    static @NotNull
    String printChessBoard(String[][] array) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                stringBuilder.append(array[i][j] + "  ");
                if (j == 7) {
                    stringBuilder.append("\n");
                }
            }
        }
        return stringBuilder.toString();
    }

}
