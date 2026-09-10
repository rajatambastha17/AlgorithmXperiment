package com.preps.questions;

import java.util.Arrays;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] input = {"bate", "batman", "batsman", "batter"};
        String result = longestCommonPrefix(input);
        System.out.println(result);
    }
    public static String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for(int i = 1; i < strs.length; i++){
            int j=0;
            String current = strs[i];
            while(j < prefix.length() && j < current.length()
                    && (prefix.charAt(j) == current.charAt(j))) {
                j++;
            }
            prefix = prefix.substring(0, j);
        }
        return prefix;
    }
}
