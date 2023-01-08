package com.peuconomia;

import java.util.Arrays;

public class IsLegalNumber {
    public static void main(String[] args) {
        int[][] inputs = new int[][]{
                new int[]{3, 2, 1},
                new int[]{3, 7, 1},
                new int[]{},

        };
        int[] bases = new int[]{4, 6, 10};

        int[] expecteds = new int[]{1, 0, 1};

        printOutput(inputs, bases, expecteds);
    }

    public static int isLegalNumber(int[] a, int base) {

        for (int num : a) {
            if (num >= base) return 0;
        }

        return 1;
    }


    public static void printOutput(int[][] inputs, int[] bases
            , int[] expecteds) {


        for (int i = 0; i < inputs.length; i++) {
            System.out.printf("Array: %-25s Base: %-5d Expected: %-5d Result: %-5d\n", Arrays.toString(inputs[i]), bases[i], expecteds[i], isLegalNumber(inputs[i], bases[i]));
        }


    }

}
