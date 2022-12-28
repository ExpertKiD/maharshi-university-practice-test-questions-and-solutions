package com.peuconomia;

import java.util.Arrays;

public class countSquarePairs {
    public static void main(String[] args) {
        int[][] inputArrays = new int[][]{
                new int[]{11, 5, 4, 20},
                new int[]{9, 0, 2, -5, 7},
                new int[]{9},
        };


        printOutput(inputArrays);
    }

    public static int countSquarePairs(int[] a) {


        // return 0 if array length s less than 2
        if (a.length < 2) return 0;

        int squarePairsCount = 0;

        // check for perfect squares
        for (int i = 0; i < a.length; i++) {
            int x = a[i];

            if (x <= 0) continue;

            for (int j = 0; j < a.length; j++) {

                if (i == j) continue;

                int y = a[j];
                if (y <= 0) continue;

                if (x < y && isPerfectSquare(x + y)) {
                    squarePairsCount++;

                    
                }
            }

        }


        return squarePairsCount;

    }

    public static boolean isPerfectSquare(int x) {
        int sqrt = (int) Math.floor(Math.sqrt(x));

        int sqr = sqrt * sqrt;

        return sqr == x;
    }

    public static void printOutput(int[][] inputs) {

        for (int[] array : inputs) {


            System.out.printf("Array: %-50s countSquarePairs: %d\n", Arrays.toString(array), countSquarePairs(array));
        }

    }
}
