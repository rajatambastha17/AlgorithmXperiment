package com.preps.questions;

import java.util.HashMap;
import java.util.Map;

public class CountVowels {
    public static void main(String[] args) {
        countVowels("My Name is Rajataaaaaaaeeeeeeeeiiiiiiiiiiuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuooo");
    }

    public static void countVowels(String s) {
        int count = 0;
        Map<Character, Integer> m = new HashMap<>();
        for (char c : s.toCharArray()) {
            count = 0;
            if (m.containsKey(c)) {
                count = m.get(c);
                m.put(c, ++count);
            } else if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                m.put(c, ++count);
            }
        }
        System.out.println(m);
    }
}
