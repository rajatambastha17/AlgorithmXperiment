package com.preps.questions;

import java.util.*;

/*
Given a String input. Return a string with the count of characters in the string.
Eg.:
input = "aaabbbbcccdeefffghhhii";
output = "a3b4c3d1e2f3g1h3i2";
 */
public class CharCountInString {

    public static void main(String[] args) {
//        String input = "aaaaaabbbbcccdeefffffffggggggggghhhiizzzzzzzzzzzzzz";
        String input = "aaaabbbbbccccvvvvffffffff";
        System.out.println(countInString(input));
    }

    public static String countInString(String input) {
        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 0; i < input.length(); i++) {
            if (i + 1 < input.length() && input.charAt(i) == input.charAt(i + 1)) {
                count++;
            } else {
                compressed.append(input.charAt(i));
                compressed.append(count);
                count = 1;
            }
        }

        return compressed.toString();
    }
}
