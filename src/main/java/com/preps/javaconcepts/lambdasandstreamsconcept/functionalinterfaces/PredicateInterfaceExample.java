package com.preps.javaconcepts.lambdasandstreamsconcept.functionalinterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateInterfaceExample {
    public static void main(String[] args) {
        Predicate<Integer> isEven = n -> n % 2 == 0;
        List<Integer> numbers = Arrays.asList(1, 2, 4, 38, 78, 521, 23, 0, 77, 12, 433, 3, 65, 12, 732, 87, 66, 43, 23);

        List<Integer> evens = numbers.stream().filter(isEven).toList();
        System.out.println(evens);
    }
}
