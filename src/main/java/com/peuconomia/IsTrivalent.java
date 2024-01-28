package com.peuconomia;

import java.util.Arrays;
import java.util.HashSet;

public class IsTrivalent {

    public static void main(String[] args) {
        int[][] inputs = new int[][]{
                new int[]{22, 19, 10, 10, 19, 22, 22, 10},
                new int[]{1, 2, 2, 2, 2, 2, 2},
                new int[]{2, 2, 3, 3, 3, 3, 2, 41, 65},
                new int[]{-1, 0, 1, 0, 0, 0},
                new int[]{},
                new int[]{Integer.MAX_VALUE, -1, -1, Integer.MIN_VALUE},
                new int[]{},
        };

        int[] outputs = new int[]{
                1, 0, 0, 1, 0, 1
        };


        printResults(inputs, outputs, IsTrivalent::isTrivalent);
        System.out.println();
        printResults(inputs, outputs, IsTrivalent::isTrivalentDSA);


    }

    /**
     * Page: 17, QN3
     *
     * @param a
     * @return 1 if array argument is trivalent, else 0
     */
    public static int isTrivalent(int[] a) {
        // initial return condition
        if (a.length < 3) return 0;

        // define and set the failSafeValue
        int failSafeValue = Integer.MIN_VALUE;

        for (int item : a) {
            if (item == failSafeValue) failSafeValue++;
        }

        // Create a set of all elements in the array
        int[] testNums = new int[]{
                failSafeValue, failSafeValue, failSafeValue
        };

        int itemCount = 0;

        for (int item : a) {
            boolean isUnique = true;

            for (int i = 0; i < itemCount; i++) {
                if (testNums[i] == item) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                if (itemCount < 3) {
                    testNums[itemCount] = item;
                    itemCount++;
                }


            }
        }


        return itemCount == 3 ? 1 : 0;


    }

    /**
     * Page: 17, QN3
     *
     * @param a
     * @return 1 if array argument is trivalent, else 0
     */
    public static int isTrivalentDSA(int[] a) {
        // initial return condition
        if (a.length < 3) return 0;

        // Create a set of all elements in the array
        HashSet<Integer> elements = new HashSet<>();

        for (int item : a) {
            elements.add(item);
        }

        return elements.size() == 3 ? 1 : 0;
    }

    public static void printResults(int[][] inputs, int[] outputs, TrivalentChecker checker) {
        for (int i = 0; i < inputs.length && i < outputs.length; i++) {
            int[] input = inputs[i];

            int output = checker.check(input);

            String result = output == outputs[i] ? "PASSED" : "FAILED";

            System.out.printf("Is Trivalent? Expected: %d Result: %d Test: %s Array: %s\n",
                    outputs[i],
                    output, result, Arrays.toString(input));
        }
    }

    private interface TrivalentChecker {
        int check(int[] a);
    }
}


