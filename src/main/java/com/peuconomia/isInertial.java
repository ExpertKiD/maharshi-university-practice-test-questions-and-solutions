package com.peuconomia;

import java.util.Arrays;

public class isInertial {
    public static void main(String[] args) {
        int[][] inputArrays = new int[][]{
                new int[]{1},
                new int[]{2},
                new int[]{1, 2, 3, 4},
                new int[]{1, 1, 1, 1, 1, 1, 2},
                new int[]{2, 12, 4, 6, 8, 11},
                new int[]{2, 12, 12, 4, 6, 8, 11},
                new int[]{-2, -4, -6, -8, -11},
                new int[]{2, 3, 5, 7},
                new int[]{2, 4, 6, 8, 10}
        };


        printOutput(inputArrays);
    }

    public static int isInertial(int[] a) {

        // if length is zero, then it's not inertial
        if (a.length == 0) return 0;


        int[] odds = Arrays.stream(a).filter(x -> x % 2 != 0).toArray();
        int[] evens = Arrays.stream(a).filter(x -> x % 2 == 0).toArray();

        // Condition 1: it contains at least one odd value
        boolean containsAtLeastOneOdd = odds.length > 0;

        // Condition 2: the maximum value in the array is even
        int maxValue = Arrays.stream(a).max().orElse(0);
        boolean isMaxValueEven = maxValue % 2 == 0;


        // Condition 3: every odd value is greater than every even value that is not the maximum value.
        boolean isEveryOddValueGreaterThanEveryEvenExceptMaximum = true;

        int[] evenNumbersExceptOddsAndMax = Arrays.stream(a).filter(x -> Arrays.stream(odds).noneMatch(n -> n == x) && x != maxValue).toArray();

        int[] cond3Exception = Arrays.stream(evenNumbersExceptOddsAndMax).filter(
                x -> Arrays.stream(odds).anyMatch(
                        num -> num < x
                )
        ).toArray();

        isEveryOddValueGreaterThanEveryEvenExceptMaximum = cond3Exception.length == 0;


        return (containsAtLeastOneOdd && isMaxValueEven && isEveryOddValueGreaterThanEveryEvenExceptMaximum) ? 1 : 0;
    }

    public static void printOutput(int[][] inputs) {

        for (int[] array : inputs) {


            System.out.printf("Array: %-50s isInertial: %d\n", Arrays.toString(array), isInertial(array));
        }

    }
}
