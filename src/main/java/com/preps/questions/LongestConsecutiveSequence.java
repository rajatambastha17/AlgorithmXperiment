package com.preps.questions;

import java.util.Arrays;

public class LongestConsecutiveSequence {

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5, 7, 6, 2, 1, 3, 4, 7, 8, 6, 8, 3, 5, 2, 3, 3, 4, 3};
        int result = longestConsecutiveSequence2(input);
        System.out.println(result);
    }

    public static int longestConsecutiveSequence(int[] input) {
        Arrays.sort(input);

        int sequence = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i + 1] - input[i] != 1) {
                break;
            }
            sequence++;
        }
        return sequence;
    }

    public static int longestConsecutiveSequence2(int[] nums) {
        Arrays.sort(nums);

        // Handle empty array or single element case
        if (nums.length <= 1) {
            return nums.length;
        }

        int sequence = 1;
        int maxSequence = 1;

        for (int i = 1; i < nums.length; i++) {
            // Check if current element is consecutive with the previous one
            if (nums[i] == nums[i - 1] + 1) {
                sequence++;
            } else if (nums[i] != nums[i - 1]) {
                // Update maxSequence if necessary and reset sequence counter
                maxSequence = Math.max(maxSequence, sequence);
                sequence = 1;
            }
        }

        // Check the last element as well (edge case)
        maxSequence = Math.max(maxSequence, sequence);

        return maxSequence;
    }
}
