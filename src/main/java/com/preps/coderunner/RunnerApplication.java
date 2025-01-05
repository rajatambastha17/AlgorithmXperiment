package com.preps.coderunner;

import com.preps.algorithms.searching.BinarySearch;

public class RunnerApplication {

    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int[] array = {1, 2, 3, 4, 6, 7, 9, 11, 13, 16, 24, 28, 45, 48, 49, 50, 55, 51, 56, 58, 59, 60, 62, 65, 68, 70, 72, 74, 76, 78, 80};
        int target = 50;
        String result = binarySearch.binarySearch(array, target);
        System.out.println(result + "\n");

        String s = "Hello";
        String s2 = "Hello";
        System.out.println(s == s2);
    }
}
