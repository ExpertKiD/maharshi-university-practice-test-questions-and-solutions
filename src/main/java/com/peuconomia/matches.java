package com.peuconomia;

import java.util.Arrays;

public class matches {
    public static void main(String[] args) {
        int[][][] inputArrays = new int[][][]{new int[][]{new int[]{1, 2, 3, -5, -5, 2, 3, 18}, new int[]{3, -2, 3},}, new int[][]{new int[]{1, 2, 3, -5, -5, 2, 3, 18}, new int[]{2, 1, -1, -1, 2, 1},}, new int[][]{new int[]{1, 2, 3, -5, -5, 2, 3, 18}, new int[]{1, 2, -1, -1, 1, 2},}, new int[][]{new int[]{1, 2, 3, -5, -5, 2, 3, 18}, new int[]{2, 1, -2, 3},}, new int[][]{new int[]{1, 2, 3, -5, -5, 2, 3, 18}, new int[]{4, -1, 3},}, new int[][]{new int[]{1, 2, 3, -5, -5, 2, 3, 18}, new int[]{2, -3, 3},}, new int[][]{new int[]{1, 2, 3, -5, -5, 2, 3, 18}, new int[]{8},},};


        int[] expected = new int[]{1, 1, 1, 1, 0, 0, 0};


        printOutput(inputArrays, expected);
    }

    public static int matches(int a[], int[] p) {

        int startIndex = 0;
        int endIndex = -1;

        for (int i = 0; i < p.length; i++) {

            int expectedCount = Math.abs(p[i]);
            int currentCount = 0;

            endIndex += Math.abs(p[i]);
            
            boolean checkNegative = p[i] < 0;
            for (int j = startIndex; j <= endIndex; j++) {

                // if number is negative
                if (checkNegative && a[j] < 0) {
                    currentCount++;

                } else if (!checkNegative && a[j] > 0) {
                    currentCount++;
                } else {
                    break;
                }
            }

            startIndex = endIndex + 1;

            if (currentCount != expectedCount) return 0;
        }


        return 1;


    }


    public static void printOutput(int[][][] inputs, int[] expected) {

        for (int i = 0; i < inputs.length; i++) {
            System.out.printf("A: %-20s P: %-20s Expected: %-5d Result: %-5d\n", Arrays.toString(inputs[i][0]), Arrays.toString(inputs[i][1]), expected[i], matches(inputs[i][0], inputs[i][1]));
        }

    }
}
