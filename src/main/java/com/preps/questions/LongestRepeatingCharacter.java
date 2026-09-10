/*
 * You are given a string s consisting of only uppercase english characters and an integer k.
 * You can choose up to k characters of the string and replace them with any other uppercase English character.
 * After performing at most k replacements, return the length of the longest substring which contains only one distinct character.
 * Example 1:
 * Input: s = "XYYX", k = 2
 * Output: 4
 * Explanation: Either replace the 'X's with 'Y's, or replace the 'Y's with 'X's.
 * Example 2:
 * Input: s = "AAABABB", k = 1
 * Output: 5
 */

package com.preps.questions;

import java.util.HashMap;
import java.util.Map;

public class LongestRepeatingCharacter {
    public static void main(String[] args) {
        String s = "XYZXXYZZXXXXYYZXYYZZZZXXXXYYXXXYZZZYYXXX";
        int k = 3;
        System.out.println(longestRepeatingCharacter(s, k));
    }

    public static int longestRepeatingCharacter(String s, int k) {
        int left = 0;
        Map<Character, Integer> charMap = new HashMap<>();
        int[] freq = new int[26];
        int maxLength = 0;
        int maxFrequency = 0;
        for (int right = 0; right < s.length(); right++) {
            char current = s.charAt(right);
            charMap.put(current, charMap.getOrDefault(current, 0) + 1);
            maxFrequency = Math.max(maxFrequency, charMap.get(current));
            int windowSize = right - left + 1;
            int changesReq = windowSize - maxFrequency;
            if (changesReq <= k) {
                maxLength = Math.max(maxLength, windowSize);
            }
            if (changesReq > k) {
                int frequency = charMap.get(s.charAt(left));
                charMap.put(s.charAt(left), --frequency);
                left++;
            }
        }
        return maxLength;
    }
}
