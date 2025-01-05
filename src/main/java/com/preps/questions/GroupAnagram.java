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

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = groupAnagramsTogether(strs);
        System.out.println(result);
    }
}
