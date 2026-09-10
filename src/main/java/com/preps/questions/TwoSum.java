package com.preps.questions;

import java.util.Arrays;
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

    public static int[] tS(int[] intput, int target) {
        int[] result = new int[2];
        boolean foundIndex = false;
        for (int i = 0; i < intput.length; i++) {
            for (int j = i + 1; j < intput.length; j++) {
                int sum = intput[i] + intput[j];
                if (sum == target) {
                    result[0] = i;
                    result[1] = j;
                    foundIndex = true;
                    break;
                }
            }
            if (foundIndex) {
                break;
            }
        }
        if (!foundIndex) {
            result[0] = -1;
            result[1] = -1;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] num = {3, 1, 7, 5, 2, 8};
        int target = 14;
        int[] result = twoSum(num, target);
        System.out.println("Numbers at index: " + Arrays.toString(result));

        int[] res = tS(num, 87);
        System.out.println("\nNumbers at index: " + Arrays.toString(res));
    }
}
