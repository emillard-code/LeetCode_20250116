package com.project.solution;

import java.util.HashMap;
import java.util.Map;

public class LeetCodeSolution {

    public static void main(String[] args) {

        int[] nums1 = new int[]{2,1,3};
        int[] nums2 = new int[]{10,2,5,0};
        System.out.println(xorAllNums(nums1, nums2));

        int[] nums3 = new int[]{1,2};
        int[] nums4 = new int[]{3,4};
        System.out.println(xorAllNums(nums3, nums4));

    }

    public static int xorAllNums(int[] nums1, int[] nums2) {

        // Get lengths of arrays
        int len1 = nums1.length;
        int len2 = nums2.length;

        // Map to store frequency of each number
        Map<Integer, Integer> freq = new HashMap<>();

        // Add frequencies for nums1 elements
        // Each element appears n2 times in final result
        for (int num : nums1) {
            freq.put(num, freq.getOrDefault(num, 0) + len2);
        }

        // Add frequencies for nums2 elements
        // Each element appears n1 times in final result
        for (int num : nums2) {
            freq.put(num, freq.getOrDefault(num, 0) + len1);
        }

        // XOR numbers that appear odd number of times
        int ans = 0;

        for (int num : freq.keySet()) {

            if (freq.get(num) % 2 == 1) {
                ans ^= num;
            }

        }

        return ans;

    }

}
