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

    public static int bitwiseXOROfAllPairings(int[] num1, int[] num2) {

        int[] num3Binary = new int[num1.length * num2.length];

        for (int i = 0; i < num1.length; i++) {

            for (int j = 0; j < num2.length; j++) {

                String num1Binary = Integer.toBinaryString(num1[i]);
                String num2Binary = Integer.toBinaryString(num2[j]);
                num3Binary[i * num2.length + j] = Integer.parseInt(xorOperation(num1Binary, num2Binary));

            }

        }

        StringBuilder bitwiseXORNum3 = new StringBuilder(Integer.toString(num3Binary[0]));

        for (int i = 0; i < num3Binary.length - 1; i++) {

            bitwiseXORNum3 = new StringBuilder(xorOperation(bitwiseXORNum3.toString(), Integer.toString(num3Binary[i+1])));

        }

        return Integer.parseInt(bitwiseXORNum3.toString(), 2);

    }

    private static String xorOperation(String binary1, String binary2) {

        StringBuilder num1Binary = new StringBuilder(binary1);
        StringBuilder num2Binary = new StringBuilder(binary2);

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

        for (int i = 0; i < num1Binary.length(); i++) {

            if (num1Binary.charAt(i) == num2Binary.charAt(i)) { binaryXor.append('0'); }
            else { binaryXor.append('1'); }

        }

        return binaryXor.toString();

    }

}
