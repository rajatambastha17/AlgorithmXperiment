package com.preps.questions;

import java.util.*;

public class TopKFrequentElements {

    public static int[] findTopKElements(int[] input, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer>[] listArray = new List[input.length + 1];
        int count = 0;
        for (int j : input) {
            count = 0;
            map.putIfAbsent(j, count);
            count = map.get(j) + 1;
            map.put(j, count);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//            listArray[entry.getValue()].add(entry.getKey());
            if (listArray[entry.getValue()] == null) {
                listArray[entry.getValue()] = new ArrayList<>();
            }
            listArray[entry.getValue()].add(entry.getKey());
        }
        List<Integer> result = new ArrayList<>();
        for (int i = listArray.length - 1; i > 0; i--) {
            if (listArray[i] != null) {
                result.addAll(listArray[i]);
            }
            if (result.size() >= k) {
                break; // Exit early once we have k elements
            }
        }
        int[] results = new int[Math.min(result.size(), k)]; //Ensure we don't go out of bounds
        for (int i = 0; i < results.length; i++) {
            results[i] = result.get(i);
        }
        return results;
    }

    public static void main(String[] args) {
        int[] input = {1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 4};
        int k = 2;
        int[] result = findTopKElements(input, k);
        for (Integer res : result) {
            System.out.print(res + " ");
        }
        System.out.println();
    }

}
