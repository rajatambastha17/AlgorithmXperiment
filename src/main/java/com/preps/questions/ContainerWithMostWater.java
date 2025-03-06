package com.preps.questions;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] input = {1, 7, 2, 5, 4, 7, 3, 6, 8, 10, 5, 9, 12};
        long start = System.currentTimeMillis();
//        calculateWater(input);
        int maxArea = calculateWaterTP(input);

        System.out.println("Maximum Area with water: " + maxArea);

        long end = System.currentTimeMillis();

        System.out.println("Time take to run: " + (end - start));
    }

    // Brute force approach
    public static void calculateWater(int[] heights) {
        int length = heights.length;
        int maxArea = 0;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                int height = Math.min(heights[i], heights[j]);
                int width = j - i;
                int area = height * width;
                maxArea = Math.max(area, maxArea);
            }
        }
        System.out.println("Maximum Area with water: " + maxArea);
    }

    // Using two pointer - optimized
    public static int calculateWaterTP(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int mArea = 0;

        while (right > left) {
            int length = Math.min(height[left], height[right]);
            int width = right - left;
            int area = length * width;
            mArea = Math.max(area, mArea);
            if (height[left] < height[right]) {
                left += 1;
            } else {
                right -= 1;
            }
        }
        return mArea;
    }
}
