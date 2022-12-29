package com.peuconomia;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class Solve10 {
    public static void main(String[] args) {


        printOutput();
    }

    public static int[] solve10() throws NoSuchElementException {

        int factorial10 = factorial(10);

        for (int i = 0; i <= 10; i++) {

            int iFactorial = factorial(i);

            for (int j = 0; j <= 10; j++) {

                int jFactorial = factorial(j);


                if ((iFactorial + jFactorial) == factorial10) {
                    return new int[]{i, j};

                }
            }
        }


        throw new NoSuchElementException("No Solution exist for this problem");


    }

    public static void printOutput() {


        System.out.printf("Solve10 Array: %-10s\n", Arrays.toString(solve10()));


    }

    public static int factorial(int n) throws IllegalArgumentException {


        if (n == 0) return 1;

        if (n < 0) throw new IllegalArgumentException("Only positive numbers are allowed.");


        return n * factorial(n - 1);
    }
}
