package com.preps.questions;

import java.util.*;

public class ThreeSum {

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};

        long start = System.currentTimeMillis();
        List<List<Integer>> result = threeSumOptimised(nums);
        long end = System.currentTimeMillis();
        System.out.println("Triplets: " + result);
        System.out.println("Time taken: " + (end - start));
    }

    public static List<List<Integer>> threeSumOptimised(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        // Step 1: Sort the array
        Arrays.sort(nums);

        // Step 2: Fix one number and use two pointers to find the others
        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicate values for the first number
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    // Found a valid triplet
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Move both pointers and skip duplicates
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;  // Need a larger number
                } else {
                    right--; // Need a smaller number
                }
            }
        }

        return result;
    }

    // Brute force approach
    public static List<List<Integer>> threeSum(int[] input) {
        List<List<Integer>> result = new ArrayList<>();
        //{-3, 1, -3, 2, 4, -4}
        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                for (int k = j + 1; k < input.length; k++) {
                    if (input[i] + input[j] + input[k] == 0) {
                        List<Integer> triplet = Arrays.asList(input[i], input[j], input[k]);
                        triplet.sort(null);
                        if (!result.contains(triplet)) {
                            result.add(triplet);
                        }
                    }
                }
            }
        }
        return result;
    }
}
