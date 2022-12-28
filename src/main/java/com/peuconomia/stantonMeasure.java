package com.peuconomia;

import java.util.Arrays;

public class stantonMeasure {
    public static void main(String[] args) {
        int[][] inputArrays = new int[][]{

                new int[]{1},
                new int[]{0},
                new int[]{3, 1, 1, 4},
                new int[]{1, 3, 1, 1, 3, 3, 2, 3, 3, 3, 4},
                new int[]{},

        };


        printOutput(inputArrays);
    }

    public static int stantonMeasure(int[] a) {
        int stantonMeasure = 0;

        if (a.length == 0) return stantonMeasure;

        int occurencesOfOne = 0;

        // count occurences of one
        for (int num : a) {
            if (num == 1)
                occurencesOfOne++;
        }

        // count occurences of number occurencesOfOne
        for (int num : a) {
            if (num == occurencesOfOne) stantonMeasure++;
        }

        return stantonMeasure;

    }

    public static void printOutput(int[][] inputs) {

        for (int[] array : inputs) {


            System.out.printf("Array: %-50s stantonMeasure: %d\n", Arrays.toString(array), stantonMeasure(array));
        }

    }

}
