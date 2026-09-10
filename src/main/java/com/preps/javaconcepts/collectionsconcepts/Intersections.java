package com.preps.javaconcepts.collectionsconcepts;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Intersections {
    public static void main(String[] args) {
        int[] arr1 = {3, 2, 3, 4, 1, 2, 1, 3};
        int[] arr2 = {9, 8, 8, 7, 8, 4, 3, 5, 5, 2, 3, 4};
        int[] res = intersection(arr1, arr2);
        for (Integer i : res) {
            System.out.println(i);
        }
    }

    public static int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> numSet1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        Set<Integer> numSet2 = Arrays.stream(nums2).boxed().collect(Collectors.toSet());
        numSet1.retainAll(numSet2);
        int[] result = numSet1.stream().mapToInt(Integer::intValue).toArray();
        return result;
    }
}
