package com.peuconomia;

import java.util.Arrays;

public class IsNUnique {
    public static void main(String[] args) {
        int[][] inputs = new int[][]{
                new int[]{7, 3, 3, 2, 4},
                new int[]{7, 3, 3, 2, 4},
                new int[]{7, 3, 3, 2, 4},
                new int[]{7, 3, 3, 2, 4},
                new int[]{7, 3, 3, 2, 4},
                new int[]{1},
        };
        int[] Ns = new int[]{6, 10, 11, 8, 4, 2};

        int[] expecteds = new int[]{0, 0, 1, 0, 0, 0};

        printOutput(inputs, Ns, expecteds);
    }

    public static int isNUnique(int[] a, int n) {

        if (a.length < 2) return 0;

        int sumEqualsCount = 0;

        for (int i = 0; i < a.length - 1; i++) {

            for (int j = i; j < a.length; j++) {
                if (i == j) continue;

                if ((a[i] + a[j]) == n) {
                    sumEqualsCount++;
                }

            }
        }


        return sumEqualsCount == 1 ? 1 : 0;
    }


    public static void printOutput(int[][] inputs, int[] Ns
            , int[] expecteds) {


        for (int i = 0; i < inputs.length; i++) {
            System.out.printf("Array: %-25s Ns: %-5d Expected: %-5d Result: %-5d\n", Arrays.toString(inputs[i]), Ns[i], expecteds[i], isNUnique(inputs[i], Ns[i]));
        }


    }
}
