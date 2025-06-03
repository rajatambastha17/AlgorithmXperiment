package com.preps.questions;

import java.util.*;

public class ThreeSum {

    public static void main(String[] args) {
//        int size = 100; // Adjust size as needed, but be mindful of performance
//        int[] input = generateLargeArray(size);
        int[] input = {-1, 0, 1, 2, -1, -4};

        long start = System.currentTimeMillis();
        List<List<Integer>> result = threeSumOptimised(input);
        long end = System.currentTimeMillis();

        System.out.println(result);
        System.out.println("Time taken: " + (end - start));
//        long start = System.currentTimeMillis();
//        System.out.println(threeSum(largeArray));
//        long end = System.currentTimeMillis();
//        System.out.println("Time taken: " + (end - start));
    }

    public static List<List<Integer>> threeSumOptimised(int[] input) {
        Arrays.sort(input);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> triplets;
        for (int i = 0; i < input.length; i++) {
            int left = i + 1;
            int right = input.length - 1;
            int targetNum = -input[i];
            while (left < right) {
                int sum = input[left] + input[right];
                if (sum == targetNum) {
                    triplets = new ArrayList<>();
                    triplets.add(input[i]);
                    triplets.add(input[left]);
                    triplets.add(input[right]);
                    result.add(triplets);
                    if (input[left + 1] != input[i]) {
                        left++;
                    }
                } else if (sum < targetNum) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return result.stream().toList();
    }

    public static List<List<Integer>> threeSumOptimised2(int[] nums) {
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

    public static int[] generateLargeArray(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            // Generate random integers within a range
            array[i] = random.nextInt(999) - 100; // Range: -1000 to 1000
        }
        return array;
    }
}
