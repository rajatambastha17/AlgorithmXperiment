package com.preps.questions;

public class ReverseString {
    public static void main(String[] args) {
        String input = " hello     world ";
        System.out.println(reversed(input));
    }

    public static String reversed(String s) {
        s = s.trim();
        StringBuilder sb = new StringBuilder();
        String[] st = s.split("\\s+");
        for (int i = st.length - 1; i >= 0; i--) {
            sb.append(st[i]).append(" ");
        }
        return sb.toString().trim();
    }
}
