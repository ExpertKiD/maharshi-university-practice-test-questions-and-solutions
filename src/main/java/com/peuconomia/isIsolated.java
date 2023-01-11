package com.peuconomia;

public class isIsolated {
    public static void main(String[] args) {
        long[] inputs =
                new long[]{
                        2, 3, 8, 9, 14, 24, 28, 34, 58, 63, 4, 2097151, 2097152, 162,

                };


        int[] expected = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, -1, 0};


        printOutput(inputs, expected);
    }

    public static int isIsolated(long n) {

        if (n > 2097151) return -1;

        long square = (long) Math.pow(n, 2);
        long cube = (long) Math.pow(n, 3);


        if (n == 0 || n == 1) return 0;

        while (square != 0) {

            long squareDigit = square % 10;
            square /= 10;


            long cubeCopy = cube;

            while (cubeCopy != 0) {
                long cubeDigit = cubeCopy % 10;
                cubeCopy /= 10;

                if (squareDigit == cubeDigit) return 0;
            }


        }


        return 1;


    }


    public static void printOutput(long[] inputs, int[] expected) {

        for (int i = 0; i < inputs.length; i++) {
            System.out.printf("N: %-10d Expected: %-5d Is Isolated: %-5d\n", inputs[i], expected[i], isIsolated(inputs[i]));
        }

    }
}
