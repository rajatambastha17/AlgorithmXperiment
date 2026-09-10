package com.preps.questions;

import java.util.HashMap;
import java.util.Map;

public class DeloitteQ1 {
    public static void main(String[] args) {
        int[] input = {5, 1, 9, 2, 5, 1, 7};
        buildArray(input);
    }

    public static void buildArray(int[] a) {
        int[] a1 = new int[a.length];
        int[] a2 = new int[a.length];
        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            indexMap.put(a[i], i);
        }
        System.out.println(indexMap);
        // Building a1; First greater element to the right
        for (int i = 0; i < a1.length; i++) {
            int firstGreaterToRight = -1;
            for (int j = i + 1; j < a1.length; j++) {
                if (a[j] > a[i]) {
                    firstGreaterToRight = a[j];
                    break;
                }
            }
            a1[i] = firstGreaterToRight;
        }

        for (int i = 0; i < a2.length; i++) {
            int firstSmallerElementToLeft = 0;
            int targetIndex = indexMap.get(a1[i]) != null ? indexMap.get(a1[i]) : 0;
            if (targetIndex > 0) {
                for (int j = targetIndex - 1; j >= 0; j--) {
                    if (a[j] < a1[i]) {
                        firstSmallerElementToLeft = a[j];
                        break;
                    }
                }
            }
            a2[i] = firstSmallerElementToLeft;
        }

        for (int item : a1) {
            System.out.print(item + " ");
        }
        System.out.println();

        for (int item : a2) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
