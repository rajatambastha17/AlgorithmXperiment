package com.preps.questions;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public static void main(String[] args) {
        String romanInput = "MMMMMMCDXLIX";
        int result = romanToInteger(romanInput);
        System.out.println("Roman number " + romanInput + " in integer is: " + result);
    }

    public static int romanToInteger(String roman) {
        Map<Character, Integer> romans = new HashMap<>();
        romans.put('I', 1);
        romans.put('V', 5);
        romans.put('X', 10);
        romans.put('L', 50);
        romans.put('C', 100);
        romans.put('D', 500);
        romans.put('M', 1000);

        if (!roman.isEmpty()) {
            if (roman.length() == 1) {
                return romans.get(roman.charAt(0));
            }
        }

        int value = 0;
        for (int i = 0; i < roman.length(); i++) {
            char current = roman.charAt(i);
            if (i != roman.length() - 1) {
                char next = roman.charAt(i + 1);
                if (current == 'I' && (next == 'V' || next == 'X')) {
                    value -= romans.get(current);
                } else if (current == 'X' && (next == 'L' || next == 'C')) {
                    value -= romans.get(current);
                } else if (current == 'C' && (next == 'D' || next == 'M')) {
                    value -= romans.get(current);
                } else {
                    value += romans.get(current);
                }
            }
        }
        value += romans.get(roman.charAt(roman.length() - 1));

        return value;
    }
}
