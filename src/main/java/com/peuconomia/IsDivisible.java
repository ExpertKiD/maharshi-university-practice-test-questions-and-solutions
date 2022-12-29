package com.peuconomia;

import java.util.Arrays;

public class IsDivisible {
    public static void main(String[] args) {
        int[][] inputs = new int[][]{
                new int[]{3, 3, 6, 36},
                new int[]{4},
                new int[]{3, 4, 3, 6, 36},
                new int[]{6, 12, 24, 36},
                new int[]{},
        };
        int[] divisors = new int[]{3, 2, 3, 12, 5,};

        printOutput(inputs, divisors);
    }

    public static int isDivisible(int[] a, int divisor) {

        for (int j : a) {
            if (j % divisor != 0) return 0;
        }

        return 1;
    }


    public static void printOutput(int[][] inputs, int[] divisors) {


        for (int i = 0; i < inputs.length; i++) {
            System.out.printf("Array: %-25s Divisor: %-5d Result: %-5d\n", Arrays.toString(inputs[i]), divisors[i], isDivisible(inputs[i], divisors[i]));
        }


    }
}
