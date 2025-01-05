package com.preps.questions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SumCheckerAskedInMedallia {
    private List<Integer> storedIntegers = new ArrayList<>();
    private Set<Integer> seenNumbers = new HashSet<>();

    public static void main(String[] args) {
        SumCheckerAskedInMedallia sumChecker = new SumCheckerAskedInMedallia();
        sumChecker.store(5);
        System.out.printf("Checking 10 expected 'false', got: '%s'.%n", sumChecker.canSum(10));
        sumChecker.store(5);
        System.out.printf("Checking 10 expected 'true', got: '%s'.%n", sumChecker.canSum(10));
        sumChecker.store(8);
        sumChecker.store(6);
        System.out.printf("Checking 18 expected 'false', got: '%s'.%n", sumChecker.canSum(18));
        System.out.printf("Checking 13 expected 'true', got: '%s'.%n", sumChecker.canSum(13));
        System.out.printf("Checking 14 expected 'true', got: '%s'.%n", sumChecker.canSum(14));
    }

    void store(int number) {
        // Add the number to the list and the hash set for efficient lookups
        storedIntegers.add(number);
        seenNumbers.add(number);
    }

    boolean canSum(int target) {
        // Use a set to track complements
        Set<Integer> complements = new HashSet<>();
        for (int num : storedIntegers) {
            if (complements.contains(num)) {
                return true; // Found a pair
            }
            complements.add(target - num);
        }
        return false; // No pair found
    }
}


/**
 * Implement a class Sumchecker that stores numbers and checks if a given number can be obtained as the sum of any two numbers stored in sumchecker
 */
//class SumCheckerQuestion {
//    List<Integer> storedIntegers = new ArrayList<>();
//
//    public static void main(String[] args) {
//        SumCheckerQuestion sumChecker = new SumCheckerQuestion();
//        sumChecker.store(5);
//        System.out.printf("Checking 10 expected 'false', got: '%s'.%n", sumChecker.canSum(10));
//        sumChecker.store(5);
//        System.out.printf("Checking 10 expected 'true', got: '%s'.%n", sumChecker.canSum(10));
//        sumChecker.store(8);
//        System.out.printf("Checking 18 expected 'false', got: '%s'.%n", sumChecker.canSum(18));
//        System.out.printf("Checking 13 expected 'true', got: '%s'.%n", sumChecker.canSum(13));
//    }
//
//    void store(int number) {
//        // TODO Add implementation.
//        storedIntegers.add(number);
//    }
//
//    boolean canSum(int number) {
//        // TODO Add implementation.
//        for (int i = 0; i < storedIntegers.size(); i++) {
//            for (int j = i + 1; j < storedIntegers.size(); j++) {
//                int sum = storedIntegers.get(i) + storedIntegers.get(j);
//                if (sum == number) {
//                    return true;
//                }
//
//            }
//        }
//        return false;
//    }
//}
//
//class SumChecker {
//    /**
//     * Stores a number.
//     *
//     * @param number to be stored.
//     */
//    void store(int number) {
//        // TODO Add implementation.
//        storedIntegers.add(number);
//    }
//    /**
//     * Check if a given number can be obtained as the sum of two numbers previously added using {@link SumChecker#store}
//     *
//     * @param number to check.
//     * @return {@code true} if two numbers previously added using {@link SumChecker#store} can be
//     * sum producing as result the number passed as argument, or {@code false} if not.
//     */
//    boolean canSum(int number) {
//        // TODO Add implementation.
//        return false;
//    }
//}
//  }