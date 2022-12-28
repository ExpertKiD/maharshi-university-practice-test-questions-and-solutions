package com.peuconomia;

import java.util.Arrays;

public class isGuthrieSequence {
    public static void main(String[] args) {
        int[][] inputArrays = new int[][]{

                new int[]{8, 4, 2, 1},
                new int[]{4, 2, 1},
                new int[]{1},
                new int[]{8, 17, 4, 1},
                new int[]{8, 4, 1},
                new int[]{8, 4, 2},

        };


        printOutput(inputArrays);
    }

    public static int isGuthrieSequence(int[] a) {
        if (a.length == 0) return 0;

        boolean isGuthrieSequence = true;

        for (int i = 1, sequenceNumber = a[0]; i < a.length; i++) {


            if (sequenceNumber % 2 == 0) {
                sequenceNumber = sequenceNumber / 2;
            } else {
                sequenceNumber = sequenceNumber * 3 + 1;
            }

            // check if sequence number is not equal to current number in the array
            if (sequenceNumber != a[i]) {
                isGuthrieSequence = false;
                break;
            }

            // check end condition
            if ((sequenceNumber == 1 && i != a.length - 1) || (sequenceNumber != 1 && i == a.length - 1)) {
                isGuthrieSequence = false;
                break;
            }


        }


        return isGuthrieSequence ? 1 : 0;
    }

    public static void printOutput(int[][] inputs) {

        for (int[] array : inputs) {


            System.out.printf("Array: %-50s isGuthrieSequence: %d\n", Arrays.toString(array), isGuthrieSequence(array));
        }

    }


}
