package com.preps.questions;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class EncodeDecodeStrings {

    public static String encode(List<String> strs) {

        StringBuilder result = new StringBuilder();
        for (String str : strs) {
            int length = str.length();
            result.append(length).append("~").append(str);
        }
        return result.toString();
    }

    public static List<String> decode(String s) {

        List<String> decoded = new ArrayList<>();
        int i = 0;
        while (i < s.length()) {
            // Find the index of the delimiter "#".
            int j = i;
            while (s.charAt(j) != '~') {
                j++;
            }
            // Extract the length of the string.
            int length = Integer.parseInt(s.substring(i, j));
            // Extract the string itself.
            String str = s.substring(j + 1, j + 1 + length);
            // Add the string to the decoded list.
            decoded.add(str);
            // Move the index to the beginning of the next encoded string.
            i = j + 1 + length;
        }
        return decoded;
    }

    public static void decode2(String input) {
        Map<Integer, String> map = new LinkedHashMap<>();

    }

    public static void main(String[] args) {

        List<String> strs = new ArrayList<>();
//        strs.add("Hello");
//        strs.add("World");
//        strs.add("!!");
//        strs.add("Its");
//        strs.add("a");
//        strs.add("good");
//        strs.add("life!");
        strs.add("!@#$%^&*()");
        strs.add("we");
        strs.add("say");
        strs.add(":");
        strs.add("yes");

        String result = encode(strs);
        List<String> decoded = decode(result);
        System.out.println(result);
        System.out.println(decoded);
    }
}
