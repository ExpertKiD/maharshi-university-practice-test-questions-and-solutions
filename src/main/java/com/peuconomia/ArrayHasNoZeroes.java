package com.peuconomia;

import java.util.Arrays;

public class ArrayHasNoZeroes {


    public static void main(String[] args) {
        int[][] inputArrays =
                new int[][]{
                        new int[]{1, 2, 3, },
                        new int[]{1, 0,4,0 },
                        new int[]{1, 2, 3,0 },
                        new int[]{0,0,0,0 },
                        new int[]{ },

                };



        int[] expected = new int[]{1,0,0,0,1};


        printOutput(inputArrays, expected);
    }

    public static int arrayHasNoZeroes(int a[]) {


        for(int num:a){
            if(num == 0) return 0;
        }

       return 1;


    }


    public static void printOutput(int[][] inputs, int[] expected) {

        for (int i = 0; i < inputs.length; i++) {
            System.out.printf("N: %-20s Expected: %-10d HasNoZeroes: %-10d\n", Arrays.toString(inputs[i]), expected[i], arrayHasNoZeroes(inputs[i]));
        }

    }
}
