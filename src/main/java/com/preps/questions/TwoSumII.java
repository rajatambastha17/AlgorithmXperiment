package com.preps.questions;

public class TwoSumII {
    public static int[] twoSumSortedArray(int[] nums, int target) {
        int j = nums.length;
        int i = 0;
        int[] result = new int[2];
        boolean continueCheck = true;
        while (continueCheck) {
            if (nums[i] + nums[j - 1] > target) {
                j--;
            } else if (nums[i] + nums[j - 1] < target) {
                i++;
            } else {
                continueCheck = false;
                result[0] = i + 1;
                result[1] = j;
            }
        }
        return result;
    }

    public static void main(String[] args) {
//        int[] nums = {2, 3, 6, 7, 8, 10, 11, 15, 18};
        int[] nums = {-2, 2, 3, 4, 5, 6, 7};
        int target = 0;
        int[] result = twoSumSortedArray(nums, target);

        for (int i : result) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
