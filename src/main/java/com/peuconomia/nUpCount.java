package com.peuconomia;

import java.util.Arrays;

public class nUpCount {
    public static void main(String[] args) {
        int[][] inputArrays = new int[][]{
                new int[]{2, 3, 1, -6, 8, -3, -1, 2},
                new int[]{6, 3, 1},
                new int[]{1, 2, -1, 5, 3, 2, -3},
        };

        int[] Ns = new int[]{
                5, 6, 20
        };

        printOutput(inputArrays, Ns);
    }

    public static int nUpCount(int[] a, int n) {

        int nUpCount = 0;

        int partialSum = 0;
        int previousPartialSum = 0;


        for (int num : a) {
            previousPartialSum = partialSum;
            partialSum += num;

            if (previousPartialSum <= n && partialSum > n) {
                nUpCount++;
            }

        }

        return nUpCount;
    }

    public static void printOutput(int[][] inputs, int[] Ns) {
        System.out.print("|--------------------------------------|---------------------------------------|\n");
        System.out.printf("|           %16s           |           %16s           |\n", "n", "nextPerfectSquare");
        System.out.print("|______________________________________|_______________________________________|\n");


        for (int i = 0; i < inputs.length; i++) {
            System.out.printf("|           %16s           |           %16d            |\n", Arrays.toString(inputs[i]), nUpCount(inputs[i], Ns[i]));
        }


        System.out.print("|______________________________________|_______________________________________|\n");
    }
}
