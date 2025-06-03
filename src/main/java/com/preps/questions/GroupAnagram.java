package com.preps.questions;

import java.util.*;

public class GroupAnagram {
    public static List<List<String>> groupAnagramsTogether(String[] strs) {
        Map<String, List<String>> resultMap = new HashMap<>();
        for (String str : strs) {
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);

            resultMap.putIfAbsent(key, new ArrayList<>());
            resultMap.get(key).add(str);
        }
        return new ArrayList<>(resultMap.values());
    }

    public static boolean isAnagram(String in1, String in2) {
        if (in1.length() != in2.length()) {
            return false;
        }
        char[] first = in1.toCharArray();
        char[] second = in1.toCharArray();
        Arrays.sort(first);
        Arrays.sort(second);
        in1 = new String(first);
        in2 = new String(second);
        return in1.equalsIgnoreCase(in2);
    }

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat", "tab"};
        List<List<String>> result = groupAnagramsTogether(strs);
        System.out.println(result);
        System.out.println("Are the given string anagram? " + isAnagram("gregory", "grerogy"));
    }
}
