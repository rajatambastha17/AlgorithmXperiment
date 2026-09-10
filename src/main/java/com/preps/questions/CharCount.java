package com.preps.questions;

import java.util.HashMap;
import java.util.Map;

public class CharCount {

    public static void count(String s) {

        Map<Character, Integer> mp = new HashMap<>();
        char[] str = s.toCharArray();
        int count = 0;
        for (int i = 0; i < str.length; i++) {
            count = 0;
            if (mp.containsKey(str[i])) {
                count = mp.get(str[i]);
                count++;
                mp.put(str[i], count);
            }
            mp.putIfAbsent(str[i], ++count);
        }
        System.out.print(mp);
    }

    public static void main(String[] args) {
        count("rajatambastha");
    }
}
