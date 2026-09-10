package com.preps.questions;

// Asked in T-Systems interview
// Input: "My name is Rajat"
// Output: "Rajat is name My"
public class ReverseWords {

    public static void main(String[] args) {
        String input = "My name is Rajat";
        String[] words = input.split(" ");
        StringBuilder output = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            output.append(words[i]).append(" ");
        }

        System.out.println(output.toString().trim());
    }
}