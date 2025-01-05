package com.preps.questions;

public class ProductExceptSelf {

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4};
//        int[] output = productExceptSelfOptimised(input);
//        for (int item : output) {
//            System.out.print(item + " ");
//        }

        int[] output = productExceptSelfExtraSpace(input);
        for (int item : output) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static int[] productExceptSelfOptimised(int[] nums) {

        int prefix = 1;
        int postfix = 1;
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            result[i] = prefix;
            prefix *= nums[i];
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] = result[i] * postfix;
            postfix = nums[i] * postfix;
        }
        return result;
    }

    public static int[] productExceptSelfExtraSpace(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int[] pref = new int[n];
        int[] suff = new int[n];

        pref[0] = 1;
        suff[n - 1] = 1;
        for (int i = 1; i < n; i++) {
            pref[i] = nums[i - 1] * pref[i - 1];
        }
        for (int i = n - 2; i >= 0; i--) {
            suff[i] = nums[i + 1] * suff[i + 1];
        }
        for (int i = 0; i < n; i++) {
            res[i] = pref[i] * suff[i];
        }
        return res;
    }
}
