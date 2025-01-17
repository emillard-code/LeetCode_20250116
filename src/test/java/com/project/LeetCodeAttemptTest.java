package com.project;

import com.project.attempt.LeetCodeAttempt;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LeetCodeAttemptTest {

    @Test
    public void bitwiseXOROfAllPairingsTest() {

        int[] nums1 = new int[]{2,1,3};
        int[] nums2 = new int[]{10,2,5,0};
        assertEquals(13, LeetCodeAttempt.bitwiseXOROfAllPairings(nums1, nums2));

        int[] nums3 = new int[]{1,2};
        int[] nums4 = new int[]{3,4};
        assertEquals(0, LeetCodeAttempt.bitwiseXOROfAllPairings(nums3, nums4));

    }

}
