package com.peuconomia;

public class primeCount {
    public static void main(String[] args) {
        int[] starts = new int[]{
                10, 11, 20, 1, 5, 6, -10,
        };
        int[] ends = new int[]{
                30, 29, 22, 1, 5, 2, 6,
        };

        printOutput(starts, ends);
    }

    public static int primeCount(int start, int end) {

        int numOfPrimes = 0;
        int actualStart = start;

        if (start <= 1 && end <= 1) {
            return 0;
        }

        if (start < 1) {
            actualStart = 2;
        }


        for (int i = actualStart; i <= end; i++) {
            if (isPrime(i)) {
                numOfPrimes++;


            }
        }


        return numOfPrimes;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int i = 2; i <= n / 2; i++) {

            if (n % i == 0) {
                return false;
            }


        }

        return true;


    }

    public static void printOutput(int[] starts, int[] ends) {
        System.out.print("|--------------------------------------|---------------------------------------|\n");
        System.out.printf("| %16s | %16s  | %16s                      |\n", "Start", "End", "Number of primes");
        System.out.print("|__________________|___________________|_______________________________________|\n");


        for (int i = 0; i < starts.length; i++) {
            System.out.printf("| %16d | %16d  | %16d                      |\n", starts[i], ends[i], primeCount(starts[i], ends[i]));
        }

        System.out.print("|______________________________________|_______________________________________|\n");
    }
}
