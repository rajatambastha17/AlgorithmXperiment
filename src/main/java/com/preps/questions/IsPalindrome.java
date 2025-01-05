package com.preps.questions;

public class IsPalindrome {

    public static void main(String[] args) {
        String input = "Was it a car or a cat II saw";
        boolean result = isPalindrome(input);
        System.out.println(result);
    }

    public static boolean isPalindrome(String inputString) {

//        Time complexity - O(n) and Space Complexity - O(n)
//        inputString = inputString.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
//        int left = 0;
//        int right = inputString.length() - 1;
//        while (left < right) {
//            if (inputString.charAt(left) != inputString.charAt(right)) {
//                return false;
//            }
//            left++;
//            right--;
//        }
//        return true;

//      Time complexity - O(n) and Space Complexity - O(1)
        int left = 0;
        int right = inputString.length() - 1;

        while (left < right) {
            // Move left pointer to the next alphanumeric character
            while (left < right && !Character.isLetterOrDigit(inputString.charAt(left))) {
                left++;
            }

            // Move right pointer to the previous alphanumeric character
            while (left < right && !Character.isLetterOrDigit(inputString.charAt(right))) {
                right--;
            }

            // Compare characters in a case-insensitive way
            if (Character.toLowerCase(inputString.charAt(left)) != Character.toLowerCase(inputString.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
