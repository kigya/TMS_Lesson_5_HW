package com.tms.multidimensionals.task2;

public class Task {

    static int[][] multiplyMatrices(int[][] lhs, int[][] rhs) {
        int[][] result = new int[Math.max(lhs.length, rhs.length)][Math.max(lhs[0].length, rhs[0].length)];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    result[i][j] += lhs[i][k] * rhs[k][j];
                }
            }
        }
        return result;
    }

    static int[][] makeNewDimension(int[][] src, int size) {
        int[][] dest = new int[size][size];
        for (int i = 0; i < src.length; i++) {
            System.arraycopy(src[i], 0, dest[i], 0, src[0].length);
        }
        return dest;
    }
}
