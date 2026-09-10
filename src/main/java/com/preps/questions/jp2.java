package com.preps.questions;

import java.lang.reflect.Array;
import java.util.*;

public class jp2 {
    public static void main(String[] args) {

        Integer[] arr = {10, 5, 2, 7, 8, 7};
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println(minMax(list, 1));
        System.out.println(minMaxOptimised(list, 3));
    }

    public static int minMax(List<Integer> list, int k) {
        int n = list.size();
        int maxMin = Integer.MIN_VALUE;

        for (int i = 0; i <= n - k; i++) {
            int currentMin = list.get(i);
            for (int j = i + 1; j < i + k; j++) {
                currentMin = Math.min(currentMin, list.get(j));
            }
            maxMin = Math.max(maxMin, currentMin);
        }
        return maxMin;
    }

    public static int minMaxOptimised(List<Integer> arr, int k) {
        int n = arr.size();
        int maxMin = Integer.MIN_VALUE;
        Deque<Integer> deque = new ArrayDeque<>();

        // Process all subarrays of length k
        for (int i = 0; i < n; i++) {
            // Remove elements outside the current window
            while (!deque.isEmpty() && deque.peekFirst() < i - k + 1) {
                deque.pollFirst();
            }

            // Remove smaller elements from the back as they won't be minima
            while (!deque.isEmpty() && arr.get(deque.peekLast()) >= arr.get(i)) {
                deque.pollLast();
            }

            deque.offerLast(i);

            // The front of deque contains the index of the minimum element in the current window
            if (i >= k - 1) {
                Optional<Integer> re = Optional.of(Math.max(maxMin, arr.get(deque.peekFirst())));
                maxMin = re.get();
            }
        }

        return maxMin;
    }
}
