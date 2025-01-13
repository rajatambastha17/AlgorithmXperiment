package com.preps.questions;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] numArr, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numArr.length; i++) {
            int requiredNumber = target - numArr[i];
            if (map.get(requiredNumber) == null) {
                map.put(numArr[i], i);
            } else {
                result[0] = map.get(requiredNumber);
                result[1] = i;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] num = {3, 6, 7, 5, 2, 8};
        int target = 14;
        int[] result = twoSum(num, target);

        for (int i : result) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
