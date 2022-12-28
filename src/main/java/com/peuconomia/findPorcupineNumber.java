package com.peuconomia;

public class findPorcupineNumber {

    public static void main(String[] args) {
        int[] inputs = new int[]{
                0,
                139,
                138
        };

        int[] expected = new int[]{
                139,
                409,
                139
        };


        printOutput(inputs, expected);
    }

    public static int findPorcupineNumber(int a) {

        int porcupine = a;


        for (int i = a + 1; i <= Integer.MAX_VALUE; i++) {

            if (isPrime(i) && i % 10 == 9) {

                int currentPrime = i;
                boolean porcupineFound = false;

                
                for (int j = currentPrime + 1; j <= Integer.MAX_VALUE; j++) {

                    if (isPrime(j)) {

                        if (j % 10 == 9) {


                            porcupineFound = true;
                        }

                        break;

                    }

                }

                if (porcupineFound) {

                    porcupine = currentPrime;
                    break;
                }


            }
        }

        return porcupine;

    }

    public static boolean isPrime(int n) {

        if (n <= 2) return false;

        for (int i = 2; i <= n / 2; i++) {

            if (n % i == 0) return false;


        }

        return true;


    }


    public static void printOutput(int[] inputs, int[] expected) {

        for (int i = 0; i < inputs.length; i++) {


            System.out.printf("Number: %-10d Exoected: %-10d countSquarePairs: %-10d\n", inputs[i], expected[i], findPorcupineNumber(inputs[i]));
        }

    }
}
