package com.preps.questions;

public class CountDigits {
    public static void main(String[] args) {
        countDigits(334578967);
    }

    public static void countDigits(int num) {
        int remaining = num;
        int count = 0;
        while (remaining > 0) {
            remaining = remaining / 10;
            count++;
        }
        System.out.println("Number " + num + " has " + count + " digits");
    }
}
