package com.project.attempt;

public class LeetCodeAttempt {

    public static void main(String[] args) {

        int[] nums1 = new int[]{2,1,3};
        int[] nums2 = new int[]{10,2,5,0};
        System.out.println(bitwiseXOROfAllPairings(nums1, nums2));

        int[] nums3 = new int[]{1,2};
        int[] nums4 = new int[]{3,4};
        System.out.println(bitwiseXOROfAllPairings(nums3, nums4));

    }

    // This method will return an int that is the XOR of all integers in a nums3[] array.
    public static int bitwiseXOROfAllPairings(int[] num1, int[] num2) {

        // We create the nums3Binary[] array that will contain the -binary- versions of the
        // integers in the num3[] array that was specified in the challenge specifications.
        int[] num3Binary = new int[num1.length * num2.length];

        // In order to fill num3Binary[], which is the XOR operation of all integers in the num1[]
        // array with all integers in the num2[] array once each, we loop through both arrays to
        // completely fill num3Binary[] with said results of the various XOR operations.
        for (int i = 0; i < num1.length; i++) {

            for (int j = 0; j < num2.length; j++) {

                String num1Binary = Integer.toBinaryString(num1[i]);
                String num2Binary = Integer.toBinaryString(num2[j]);
                num3Binary[i * num2.length + j] = Integer.parseInt(xorOperation(num1Binary, num2Binary));

            }

        }

        // Since the challenge specifications asked for the bitwise XOR operation of all num3[]
        // integers, we will use bitwiseXORNum3 to store the solution and perform the XOR operations
        // one by one until it's been done with all num3Binary[] binary integers.
        StringBuilder bitwiseXORNum3 = new StringBuilder(Integer.toString(num3Binary[0]));

        for (int i = 0; i < num3Binary.length - 1; i++) {

            bitwiseXORNum3 = new StringBuilder(xorOperation(bitwiseXORNum3.toString(), Integer.toString(num3Binary[i+1])));

        }

        // Once the XOR operations are complete, revert the binary string back to an integer and return the answer.
        return Integer.parseInt(bitwiseXORNum3.toString(), 2);

    }

    // Helper method to perform a XOR operation between two binary strings.
    private static String xorOperation(String binary1, String binary2) {

        StringBuilder num1Binary = new StringBuilder(binary1);
        StringBuilder num2Binary = new StringBuilder(binary2);

        // To keep them the same length and make looping through them easier later, we will
        // append '0's to the front of the shorter binary string if their lengths are not equal.
        if (num1Binary.length() < num2Binary.length()) {

            while (num1Binary.length() != num2Binary.length()) {
                num1Binary.insert(0, '0');
            }

        } else if (num1Binary.length() > num2Binary.length()) {

            while (num1Binary.length() != num2Binary.length()) {
                num2Binary.insert(0, '0');
            }

        }

        StringBuilder binaryXor = new StringBuilder();

        // We perform the actual binary XOR operations in this loop.
        for (int i = 0; i < num1Binary.length(); i++) {

            if (num1Binary.charAt(i) == num2Binary.charAt(i)) { binaryXor.append('0'); }
            else { binaryXor.append('1'); }

        }

        return binaryXor.toString();

    }

}
