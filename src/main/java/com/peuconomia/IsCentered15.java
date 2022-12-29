package com.peuconomia;

import java.util.Arrays;

public class IsCentered15 {
    public static void main(String[] args) {

        int[][] inputArrays = new int[][]{
                new int[]{3, 2, 10, 4, 1, 6, 9},
                new int[]{2, 10, 4, 1, 6, 9},
                new int[]{3, 2, 10, 4, 1, 6},
                new int[]{1, 1, 8, 3, 1, 1},
                new int[]{9, 15, 6},
                new int[]{1, 1, 2, 2, 1, 1},
                new int[]{1, 1, 15 - 1, -1},
                new int[]{15},
                new int[]{7},
        };

        int[] expected = new int[]{
                1,
                0,
                0,
                1,
                1,
                0,
                1,
                1,
                0
        };

        printOutput(inputArrays, expected);
    }

    public static int isCentered15(int[] a) {


        if (a.length == 0) return 0;


        for (int i = 0, j = a.length - 1; i < a.length && j >= 0 && i <= j; i++, j--) {

            int sum = 0;
            for (int k = i; k <= j; k++) {
                sum += a[k];
            }

            if (sum == 15) return 1;
        }


        return 0;
    }

    public static void printOutput(int[][] inputs, int[] expecteds) {

        for (int i = 0; i < inputs.length; i++) {
            System.out.printf("Array: %-25s N: %-10d Result: %1d\n", Arrays.toString(inputs[i]), expecteds[i], isCentered15(inputs[i]));
        }


    }

}
