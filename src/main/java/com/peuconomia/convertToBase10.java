package com.peuconomia;

import java.util.Arrays;

public class convertToBase10 {

    public static void main(String[] args) {
        int[][] inputArrays = new int[][]{
                new int[]{1, 0, 1, 1},
                new int[]{1, 1, 2},
                new int[]{3, 2, 5},
                new int[]{3, 7, 1},
        };

        int[] bases = new int[]{2, 3, 8, 6};

        int[] expected = new int[]{11, 14, 213, -1};


        printOutput(inputArrays, bases, expected);
    }

    public static int convertToBase10(int[] a, int base) {

        int isLegal = IsLegalNumber.isLegalNumber(a, base);

        if (isLegal == 0) return -1;


        int result = 0;


        for (int i = a.length - 1; i >= 0; i--) {


            result += a[i] * (int) Math.pow(base, a.length - i - 1);

        }


        return result;


    }


    public static void printOutput(int[][] inputs, int[] bases, int[] expected) {


        for (int i = 0; i < inputs.length; i++) {
            System.out.printf("Array: %-30s Base: %-5d Expected: %-5d Result: %-5d\n", Arrays.toString(inputs[i]), bases[i], expected[i], convertToBase10(inputs[i], bases[i]));


        }

    }
}
