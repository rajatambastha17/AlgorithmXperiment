package com.preps.questions;

import java.util.ArrayList;
import java.util.List;

public class CombinationsInString {

    public static void main(String[] args) {
        List<String> list = combinations("abcd");
        System.out.println(list);
    }

    public static List<String> combinations(String s) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(s.charAt(i));
            for (int j = 0; j < s.length(); j++) {
                if (j != i) {
                    sb.append(s.charAt(j));
                }
            }
            list.add(sb.toString());
        }
        return list;
    }
}
