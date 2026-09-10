package com.preps.questions;

import jdk.jfr.Experimental;

import java.util.Arrays;
import java.util.List;

public class ReverseFizzBuzz {
    public static void main(String[] args) {

        String[] input1 = {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"};

        String[] input2 = {"Fizz", "Fizz", "Fizz", "Fizz", "FizzBuzz", "Fizz", "Fizz", "Fizz", "Fizz", "FizzBuzz", "Fizz", "Fizz", "Fizz", "Fizz", "FizzBuzz", "Fizz", "Fizz", "Fizz", "Fizz", "FizzBuzz"};

        String[] input3 = {"1", "2", "3", "4", "5", "6", "7", "8", "Buzz", "10", "11", "12", "13", "14", "15", "16", "17", "Buzz", "19", "20", "21", "22", "23", "24", "25", "26", "Buzz", "28", "29", "Fizz"};

        String[] input6 = {"Buzz", "25", "26", "Fizz", "28", "29", "Buzz", "31", "32", "33", "34", "35", "FizzBuzz", "37", "38", "39", "40", "41", "Buzz", "43"};

        System.out.println(reverseFizzBuzz(input1));
        System.out.println(reverseFizzBuzz(input2));
        System.out.println(reverseFizzBuzz(input3));
        System.out.println(reverseFizzBuzz(input6));

    }

    public static List<Integer> reverseFizzBuzz(String[] input) {
        int length = input.length;

        int start = -1;
        for (int i = 0; i < length; i++) {
            String s = input[i];
            if (isNumeric(s)) {
                int num = Integer.parseInt(s);
                start = num - i;
                break;
            }
        }
        if (start == -1) {
            start = 1;
        }
        int maxNum = start + length - 1;
        boolean match;
        for (int fizz = 1; fizz <= maxNum; fizz++) {
            for (int buzz = 1; buzz <= maxNum; buzz++) {
                match = true;
                for (int i = 0; i < length; i++) {
                    int num = start + i;
                    String result = "";
                    if (num % fizz == 0) {
                        result += "Fizz";
                    }
                    if (num % buzz == 0) {
                        result += "Buzz";
                    }
                    if (result.isEmpty()) {
                        result = String.valueOf(num);
                    }
                    if (!result.equals(input[i])) {
                        match = false;
                        break;
                    }
                }
                if (match) {
                    return Arrays.asList(fizz, buzz);
                }
            }
        }
        return Arrays.asList(-1, -1);
    }

    private static boolean isNumeric(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
}
