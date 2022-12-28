package com.peuconomia;

import java.util.Arrays;

public class isMadhavArray {
    public static void main(String[] args) {
        int[][] inputs = new int[][]{
                new int[]{2, 1, 1},
                new int[]{2, 1, 1, 4, -1, -1},
                new int[]{6, 2, 4, 2, 2, 2, 1, 5, 0, 0},
                new int[]{18, 9, 10, 6, 6, 6},

                new int[]{-6, -3, -3, 8, -5, -4},
                new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1,
                        1, -2, -1},
                new int[]{3, 1, 2, 3, 0},
        };

        printOutput(inputs);
    }

    public static int isMadhavArray(int[] a) {


        if (!isValidMadhavArrayLength(a.length)) return 0;

        int currentIteration = 0;

        int currentStartIndex = 0;
        int currentEndIndex = 0;
        int sumToValidate = 0;


        while (currentEndIndex < a.length) {

            int calculatedSum = 0;

            if (currentIteration == 0) {
                sumToValidate = a[0];

                currentIteration++;
                currentStartIndex = currentIteration + currentStartIndex;
                currentEndIndex = currentStartIndex + currentIteration;

                continue;
            }

            for (int i = currentStartIndex; i <= currentEndIndex; i++) {
                calculatedSum += a[i];
            }

            if (calculatedSum != sumToValidate) {
                return 0;

            }


            // must increase these
            currentIteration++;
            currentStartIndex = currentIteration + currentStartIndex;
            currentEndIndex = currentStartIndex + currentIteration;


        }


        return 1;
    }

    public static boolean isValidMadhavArrayLength(int length) {

        if (length == 0) return false;


        // (n * (n+1))/2 = length
        for (int i = 0; i <= length; i++) {
            int result = i * (i + 1);


            if (result == (2 * length)) return true;

        }

        return false;


    }

    public static void printOutput(int[][] inputs) {


        for (int[] a : inputs) {
            System.out.printf("Array: %50s isMadhavArray: %d\n", Arrays.toString(a), isMadhavArray(a));
        }


    }
}
