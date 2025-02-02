package com.preps.questions;

import java.util.Arrays;

public class MergeSortedArrays {

    public static void main(String[] args) {
        int[] a1 = {1, 1, 2, 3, 4, 4, 5, 7, 8, 9, 9, 9};
        int[] a2 = {2, 3, 4, 4, 4, 5, 5, 6, 7, 7, 7, 7};
        int[] result = mergeArrays(a1, a2);
        System.out.print("[ ");
        for (int i : result) {
            System.out.print(i + " ");
        }
        System.out.print("]");
    }

    //Brute Force Method
    public static int[] mergeArrays(int[] array1, int[] array2) {
        int N = array1.length;
        int M = array2.length;
        int[] result = new int[N + M];

        int i = 0, j = 0, k = 0;
        while (i < N && j < M) {
            if (array1[i] <= array2[j]) {
                result[k++] = array1[i];
                i++;
            } else {
                result[k++] = array2[j];
                j++;
            }
        }// Handle remaining elements from array1
        while (i < N) {
            result[k++] = array1[i];
            i++;
        }

        // Handle remaining elements from array2
        while (j < M) {
            result[k++] = array2[j];
            j++;
        }
        return result;
    }

}
