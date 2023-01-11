package com.peuconomia;

import java.util.Arrays;

public class isSumSafe {
    public static void main(String[] args) {
        int[][] inputs =
                new int[][]{
                        new int[]{5, -5, 0},
                        new int[]{5, -2, 1},

                };


        int[] expected = new int[]{0, 1};


        printOutput(inputs, expected);
    }

    public static int isSumSafe(int[] a) {

        if (a.length == 0) return 0;

        int sum = 0;
        
        for (int num : a) {
            sum += num;
        }

        for (int num : a) {
            if (sum == num) return 0;
        }


        return 1;


    }


    public static void printOutput(int[][] inputs, int[] expected) {

        for (int i = 0; i < inputs.length; i++) {
            System.out.printf("Array: %-30s Expected: %1d IsSumSafe: %1d\n", Arrays.toString(inputs[i]), expected[i], isSumSafe(inputs[i]));
        }

    }
}
