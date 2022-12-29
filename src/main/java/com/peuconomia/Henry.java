package com.peuconomia;

public class Henry {
    public static void main(String[] args) {
        int[] starts = new int[]{
                1,
        };
        int[] ends = new int[]{
                3,
        };

        printOutput(starts, ends);
    }

    public static int henry(int i, int j) {

        int factorialCount = 0;
        int sum = 0;

        for (int k = 2; k < Integer.MAX_VALUE; k++) {
            if (k == sumOfFactorialsOfANumberExcept(k)) {
                factorialCount++;

                if (factorialCount == i) {
                    sum += k;
                }

                if (factorialCount == j) {
                    sum += k;
                    break;
                }
            }


        }

        return sum;
    }

    public static int sumOfFactorialsOfANumberExcept(int num) {
        int sum = 0;

        if (num == 0 || num == 1) return sum;


        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        return sum;
    }


    public static void printOutput(int[] Is, int[] Js) {


        for (int i = 0; i < Is.length; i++) {
            System.out.printf("Start: %-5d End: %-5d Result: %-5d\n", Is[i], Js[i], henry(Is[i], Js[i]));
        }


    }
}
