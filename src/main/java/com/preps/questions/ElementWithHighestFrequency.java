package com.preps.questions;

import java.util.HashMap;
import java.util.Map;

public class ElementWithHighestFrequency {

    public static void getHighestFrequencyElement(int[] input) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        int count = 0;
        for (int item : input) {
            count = 0;
            if (frequencyMap.get(item) != null) {
                count = frequencyMap.get(item);
                frequencyMap.put(item, ++count);
            } else {
                frequencyMap.put(item, ++count);
            }

        }
        count = 0;
        int highestFrequencyNumber = 0;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > count) {
                count = entry.getValue();
                highestFrequencyNumber = entry.getKey();
            }
        }
        System.out.printf("Number with highest frequency %s: . It occurred %s times\n", highestFrequencyNumber, count);
    }

    public static void main(String[] args) {
        int[] input = {3, 3, 3, 4, 5, 5, 6, 6, 6, 7, 8, 9, 10, 6, 6};
        long start = System.currentTimeMillis();
        getHighestFrequencyElement(input);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
