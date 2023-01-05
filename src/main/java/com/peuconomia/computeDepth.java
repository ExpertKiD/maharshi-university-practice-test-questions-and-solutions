package com.peuconomia;

public class computeDepth {

    public static void main(String[] args) {
        int[] inputArrays = new int[]{42, 7, 13, 25};

        int[] expected = new int[]{9, 10, 8, 36};


        printOutput(inputArrays, expected);
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


    public static void printOutput(int[] inputs, int[] expected) {

        for (int i = 0; i < inputs.length; i++) {
            System.out.printf("N: %-10d Expected: %-10d ComputeDepth: %-10d\n", inputs[i], expected[i], computeDepth(inputs[i]));
        }

    }
}
