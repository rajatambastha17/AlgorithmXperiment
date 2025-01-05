package com.preps.algorithms.searching;

public class BinarySearch {

    public String binarySearch(int[] array, int target) {

        int low = 0;
        int high = array.length - 1;
        int cuurentMiddleElement = 0;
        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (array[mid] == target) {
                cuurentMiddleElement = array[mid];
                return target + " found at index: " + mid;
            } else if (target < array[mid]) {
                cuurentMiddleElement = array[mid];
                high = mid - 1;
            } else {
                cuurentMiddleElement = array[mid];
                low = mid + 1;
            }
        }
        return "Element not found in the array!";
    }
}