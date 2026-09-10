package com.preps.javaconcepts.lambdasandstreamsconcept.streams.questions;

import com.preps.javaconcepts.equalsandhascodeconcept.Student;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamPractice {
    public static void main(String[] args) {

        // Use Stream API to square each number in the list and collect the result into a new list.
        List<Integer> nums = Arrays.asList(2, 5, 6, 7, 8, 12, 14, 16, 21, 23, 24, 25);
        List<Integer> result;
        result = nums.stream().map(num -> num * num).toList();
        System.out.println("\n" + result);

        // Use Stream API to find the length of the longest name in the list.
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eva");
        int max = names.stream().mapToInt(String::length).max().orElse(0);
        System.out.println("\nLongest name:" + max);

        // Use Stream API to count the total number of distinct words (case-insensitive) in all the sentences.
        List<String> sentences = Arrays.asList(
                "Java Stream API provides a fluent interface for processing sequences of elements.",
                "It supports functional-style operations on streams of elements, such as map-reduce transformations.",
                "In this exercise, you need to count the total number of words in all sentences."
        );
        long count = sentences.stream()
                .flatMap(sentence -> Arrays.stream(sentence.split("\\W+")))
                .map(String::toLowerCase)
                .filter(word -> !word.isEmpty())
                .distinct()
                .count();
        System.out.println("\nCount -> " + count);

        // Use Stream API to find the concatenation of the first two words that have even lengths.
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry", "apple", "guava", "cherry", "pear", "date", "Apple", "ElDERberry");
        String concatenated = words.stream().filter(word -> word.length() % 2 == 0).limit(2).collect(Collectors.joining());
        // Alternate solution:
        // Optional<String> concatenated = words.stream().filter(word -> word.length() % 2 == 0).limit(2).reduce((a, b) -> a+b);
        System.out.println("\nFirst two words concatenated: " + concatenated);

        // Use Stream API to find the sum of the squares of even numbers in the list.
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        int res = numbers.stream().filter(num -> num % 2 == 0).mapToInt(number -> number * number).sum();
        System.out.println("\nSum of squares of numbers: " + res);

        // Calculate the average of a list of integers using streams.
        double avg = numbers.stream().mapToDouble(Integer::doubleValue).average().orElse(0.0);
        System.out.println("\nAverage of numbers: " + avg);

        // Convert a list of strings to uppercase or lowercase using streams.
        List<String> uppercase = words.stream().map(String::toUpperCase).toList();
        System.out.println("\nWords converted to upper case: " + uppercase);

        // Remove all duplicate elements from a list using streams
        List<String> removedDuplicates = words.stream().distinct().toList();
        System.out.println("\nDistinct elements are: " + removedDuplicates);

        // Sort a list of strings in alphabetical order, ascending and descending using streams
        // If we want to follow case sensitivity and alphabetical ordering
        List<String> sorted = words.stream().sorted(String.CASE_INSENSITIVE_ORDER).toList();
        // If only sorting is the concern which will not take case sensitivity into account
        // List<String> sorted = words.stream().sorted().toList();
        System.out.println("\nSorted list is" + sorted);

    }
}
