package com.preps.questions;

public class TrappingRainWater {
    public static void main(String[] args) {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int totalWater = trappingRainWater(height);
        System.out.println("Total water trapped: " + totalWater);
    }

    public static int trappingRainWater(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxHeight_left = height[left];
        int maxHeight_right = height[right];
        int waterContained = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                left++;
                maxHeight_left = Math.max(maxHeight_left, height[left]);
                waterContained += maxHeight_left - height[left];
            } else {
                right--;
                maxHeight_right = Math.max(maxHeight_right, height[right]);
                waterContained += maxHeight_right - height[right];
            }
        }

        return waterContained;
    }
}
