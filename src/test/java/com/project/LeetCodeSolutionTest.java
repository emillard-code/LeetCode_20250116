package com.project;

import com.project.solution.LeetCodeSolution;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LeetCodeSolutionTest {

    @Test
    public void bitwiseXOROfAllPairingsTest() {

        int[] nums1 = new int[]{2,1,3};
        int[] nums2 = new int[]{10,2,5,0};
        assertEquals(13, LeetCodeSolution.xorAllNums(nums1, nums2));

        int[] nums3 = new int[]{1,2};
        int[] nums4 = new int[]{3,4};
        assertEquals(0, LeetCodeSolution.xorAllNums(nums3, nums4));

    }

}
