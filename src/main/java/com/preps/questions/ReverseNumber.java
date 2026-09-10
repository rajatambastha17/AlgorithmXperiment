package com.preps.questions;

public class ReverseNumber {
    public static void main(String[] args) {
        reverseTheNumber(716245612);
    }

    public static void reverseTheNumber(int num) {
        System.out.println("Original number: " + num);
        boolean isNegative = false;
        if (num < 0) {
            isNegative = true;
            num = -num;
        }
        int digit = 0;
        int remaining = num;
        int reversedNum = 0;
        while (remaining > 0) {
            digit = remaining % 10;
            reversedNum = (reversedNum * 10) + digit;
            remaining = remaining / 10;
        }
        if (isNegative) {
            System.out.println("Reversed number: " + (-reversedNum));
        } else {
            System.out.println("Reversed number: " + reversedNum);
        }
    }
}
