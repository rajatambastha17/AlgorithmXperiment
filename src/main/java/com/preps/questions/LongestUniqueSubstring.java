package com.preps.questions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestUniqueSubstring {
    public static void main(String[] args) {
        String input = "abcdefcdfghyzmno";
        System.out.println(longestUniqueSubstringOptimal(input));
    }

    public static int longestUniqueSubstring(String input) {
        int left = 0;
        int right = 0;
        int currentMaxLengthOfSubstring = 0;
        int previousMaxLengthOfSubstring = 0;
        Set<Character> charSet = new HashSet<>();
        while (right < input.length()) {
            if (!charSet.contains(input.charAt(right))) {
                charSet.add(input.charAt(right));
                currentMaxLengthOfSubstring++;
                right++;
            } else {
                charSet.clear();
                left++;
                right = left;
                if (currentMaxLengthOfSubstring > previousMaxLengthOfSubstring) {
                    previousMaxLengthOfSubstring = currentMaxLengthOfSubstring;
                }
                currentMaxLengthOfSubstring = 0;
            }
        }
        return Math.max(currentMaxLengthOfSubstring, previousMaxLengthOfSubstring);
    }

    public static int longestUniqueSubstringOptimal(String s) {
        int left = 0;
        int maxLength = 0;
        Map<Character, Integer> charMap = new HashMap<>();
        for (int right = 0; right < s.length(); right++) {
            char current = s.charAt(right);
            if (charMap.containsKey(current) && charMap.get(current) >= left) {
                left = charMap.get(current) + 1;
            }
            charMap.put(current, right);
            maxLength = Math.max(maxLength, (right - left + 1));
        }
        return maxLength;
    }
}
