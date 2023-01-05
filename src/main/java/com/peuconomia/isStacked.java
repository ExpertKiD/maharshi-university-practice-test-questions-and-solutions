package com.peuconomia;

public class isStacked {
    public static void main(String[] args) {
        int[] inputs =
                new int[]{
                        10, 7, 15, 21, 16

                };


        int[] expected = new int[]{1, 0, 1, 1, 0};


        printOutput(inputs, expected);
    }

    public static int isStacked(int n) {

        if (n < 0) return 0;

        int sum = 0;

        int i = 1;
        while (sum <= n) {

            // increment sum
            sum += i;

            if (sum > n) {
                return 0;
            } else if (sum == n) {
                return 1;
            } else {
                i++;
            }


        }


        return 1;


    }


    public static void printOutput(int[] inputs, int[] expected) {

        for (int i = 0; i < inputs.length; i++) {
            System.out.printf("N: %-5d Expected: %-5d Is Stacked: %-5d\n", inputs[i], expected[i], isStacked(inputs[i]));
        }

    }
}
