package com.peuconomia;

import java.util.HashSet;
import java.util.Set;

public class computeDepth {

    public static void main(String[] args) {
        int[] inputArrays = new int[]{42, 7, 13, 25};

        int[] expected = new int[]{9, 10, 8, 36};

        System.out.println("Without DSA");
        printOutput(inputArrays, expected, computeDepth::computeDepth);
        System.out.println("\nWith DSA");
        printOutput(inputArrays, expected, computeDepth::computeDepthDSA);
    }

    public static int computeDepth(int n) {

        if (n == 0) throw new IllegalArgumentException("n cannot be zero");

        int depth = 0;

        boolean[] digitExists = new boolean[]{
                false,
                false,
                false,
                false,
                false,
                false,
                false,
                false,
                false,
                false,
        };

        for (int i = 1; i < Integer.MAX_VALUE / n; i++) {

//            System.out.printf("Multiple: %-3d * %-3d = %-3d Digits Found: ", n,i,n*i);


            // Get the multiple
            int multiple = i * n;

            depth = i;

            // check the digits and set digitsExists
            while (multiple != 0) {
                int digit = multiple % 10;


                // set the digitExists to true
                if (digitExists[digit] == false) {
                    digitExists[digit] = true;

//                    System.out.printf("%-3d ",digit);
                }

                multiple /= 10;

            }

            // verify if all digits exists
            // if all digits exists increment depth by one and return else increment deplth only

//            System.out.printf(" Depth: %-3d DigitsFoundArray: %-30s\n",depth,  Arrays.toString(digitExists));


            boolean allDigitExists = true;

            for (int j = 0; j < digitExists.length; j++) {
                if (digitExists[j] == false) {
                    allDigitExists = false;
                    break;
                }
            }

            if (allDigitExists) {
                return depth;
            }

        }

        return depth;


    }

    public static int computeDepthDSA(int n) {

        if (n == 0) throw new IllegalArgumentException("n cannot be zero");

        int depth = 0;

        Set<Integer> set = new HashSet<>();

        for(depth=1; depth<Integer.MAX_VALUE; depth++){
            /// get the digits
            int number = n * depth;

            while(number!=0){
                int digit = number % 10;
                number /=10;

                set.add(digit);

                if(set.size()==10){
                    set.clear();
                    return  depth;
                }
            }
        }

        return depth;


    }


    public static void printOutput(int[] inputs, int[] expected, DepthChecker checker) {

        for (int i = 0; i < inputs.length; i++) {
            System.out.printf("N: %-10d Expected: %-10d ComputeDepth: %-10d\n", inputs[i], expected[i], checker.check(inputs[i]));
        }

    }

    private interface DepthChecker {
        int check(int n);
    }
}
