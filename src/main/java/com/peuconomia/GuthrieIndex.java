package com.peuconomia;

public class GuthrieIndex {

    public static void main(String[] args) {
        int[] inputArrays = new int[]{1, 2, 3, 4, 42,};

        int[] expected = new int[]{0, 1, 7, 2, 8};


        printOutput(inputArrays, expected);
    }

    public static int guthrieIndex(int n) {

        if (n == 1) return 0;
        int index = 0;


        for (int i = n; i != 1; index++) {

            if (i % 2 == 0) {
                i /= 2;
            } else {
                i = 3 * i + 1;
            }
        }


        return index;


    }


    public static void printOutput(int[] inputs, int[] expected) {

        for (int i = 0; i < inputs.length; i++) {
            System.out.printf("N: %-10d Expected: %-10d guthrieIndex: %-10d\n", inputs[i], expected[i], guthrieIndex(inputs[i]));
        }

    }
}
