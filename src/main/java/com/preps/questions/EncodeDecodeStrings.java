package com.preps.questions;

import java.util.ArrayList;
import java.util.List;

public class EncodeDecodeStrings {

    public static String encode(List<String> strs) {

        StringBuilder result = new StringBuilder();
        for (String str : strs) {
            int length = str.length();
            result.append(length).append("#").append(str);
        }
        return result.toString();
    }

    public static List<String> decode(String str) {

        List<String> ans = new ArrayList<>();
        int i = 0, n = str.length();
        while (i < n) {
            int size = str.charAt(i++);
            ans.add(str.substring(i, i + size));
            i += size;
        }
        return ans;
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
