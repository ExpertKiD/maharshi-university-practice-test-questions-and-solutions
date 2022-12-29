package com.peuconomia;

import java.util.ArrayList;
import java.util.Arrays;

public class RepsEqual {
    public static void main(String[] args) {

        int[][] inputArrays = new int[][]{
                new int[]{3, 2, 0, 5, 3},
                new int[]{3, 2, 0, 5},
                new int[]{3, 2, 0, 5, 3, 4},
                new int[]{2, 3, 0, 5, 3},
                new int[]{9, 3, 1, 1, 2},
                new int[]{0, 3, 2, 0, 5, 3},
        };

        int[] n = new int[]{
                32053,
                32053,
                32053,
                32053,
                32053,
                32053,
        };

        printOutput(inputArrays, n);
    }

    public static int repsEqual(int[] a, int n) {
        int[] numArray = String.valueOf(n).chars().map(x -> Integer.parseInt(String.valueOf((char) x))).toArray();

        ArrayList<Integer> arrayWithoutLeadingZeros = new ArrayList<>();
        boolean isLeadingZero = true;

        for (int j : a) {

            if (j == 0 && isLeadingZero) {
                continue;
            } else {
                isLeadingZero = false;
            }

            arrayWithoutLeadingZeros.add(j);
        }

        int[] intArrayWithoutLeadingZeros = arrayWithoutLeadingZeros.stream().mapToInt(Integer::intValue).toArray();


        if (intArrayWithoutLeadingZeros.length != numArray.length) return 0;

        for (int i = 0; i < intArrayWithoutLeadingZeros.length; i++) {


            if (intArrayWithoutLeadingZeros[i] != numArray[i]) return 0;

        }

        return 1;
    }

    public static void printOutput(int[][] inputs, int[] Ns) {

        for (int i = 0; i < inputs.length; i++) {
            System.out.printf("Array: %-25s N: %-10d Result: %1d\n", Arrays.toString(inputs[i]), Ns[i], repsEqual(inputs[i], Ns[i]));
        }


    }


}
