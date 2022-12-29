package com.peuconomia;

public class IsSquare {
    public static void main(String[] args) {
        int[] inputs = new int[]{
                4, 25, -4, 8, 0,
        };


        int[] expecteds = new int[]{1, 1, 0, 0, 1};

        printOutput(inputs, expecteds);
    }

    public static int isSquare(int a) {
        if (a < 0) return 0;

        if (a == 0 || a == 1) return 1;

        for (int i = 2; i <= a / 2; i++) {
            if (i * i == a) return 1;
        }

        return 0;
    }


    public static void printOutput(int[] inputs
            , int[] expecteds) {


        for (int i = 0; i < inputs.length; i++) {
            System.out.printf("Number: %-5d Expected: %-5d Result: %-5d\n", inputs[i], expecteds[i], isSquare(inputs[i]));
        }


    }
}
