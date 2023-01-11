package com.peuconomia;

import java.util.Arrays;

public class isVanilla {
    public static void main(String[] args) {
        int[][] inputs =
                new int[][]{
                        new int[]{1},
                        new int[]{11, 22, 13, 34, 125},
                        new int[]{9, 999, 99999, -9999},
                        new int[]{},

                };


        int[] expected = new int[]{1, 0, 1, 1};


        printOutput(inputs, expected);
    }

    public static int isVanilla(int[] a) {


        int oldDigit = -1;

        for (int num : a) {

            int n = Math.abs(num);

            while (n != 0) {
                int digit = n % 10;
                n /= 10;

                // one time setup
                if (oldDigit == -1) {
                    oldDigit = digit;
                }

                if (oldDigit != digit) return 0;

            }


        }

        return 1;


    }


    public static void printOutput(int[][] inputs, int[] expected) {

        for (int i = 0; i < inputs.length; i++) {
            System.out.printf("Array: %-30s Expected: %1d isVanilla: %1d\n", Arrays.toString(inputs[i]), expected[i], isVanilla(inputs[i]));
        }

    }
}

