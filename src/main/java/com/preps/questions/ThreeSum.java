package com.preps.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ThreeSum {

    public static void main(String[] args) {
        int size = 1000; // Adjust size as needed, but be mindful of performance
        int[] largeArray = generateLargeArray(size);
//        int[] input = {-3, 1, -3, 2, 4, -4};
        long start = System.currentTimeMillis();
        System.out.println(threeSum(largeArray));
        long end = System.currentTimeMillis();
        System.out.println("Time taken: " + (end - start));
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
            array[i] = random.nextInt(2001) - 1000; // Range: -1000 to 1000
        }
        return array;
    }
}
