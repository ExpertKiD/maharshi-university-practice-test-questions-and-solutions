package com.peuconomia;

public class IsPerfectSquare {

    public static void main(String[] args) {
        int[] inputs = new int[]{
                5, 36, 0, -5, 9
        };

        printOutput(inputs);
    }

    public static int nextPerfectSquare(int n) {

        int nextPerfectSquare = 0;

        for (int i = n + 1; i < Integer.MAX_VALUE; i++) {
            int num = i;
            double sqrt = Math.sqrt(num);

            if ((double) ((int) sqrt) == sqrt) {
                nextPerfectSquare = num;
                break;
            }

        }


        return nextPerfectSquare;
    }

    public static void printOutput(int[] inputs) {
        System.out.print("|--------------------------------------|---------------------------------------|\n");
        System.out.printf("|           %16s           |           %16s           |\n", "n", "nextPerfectSquare");
        System.out.print("|______________________________________|_______________________________________|\n");


        for (int n : inputs) {
            System.out.printf("|           %16d           |           %16d            |\n", n, nextPerfectSquare(n));
        }

        System.out.print("|______________________________________|_______________________________________|\n");
    }
}
