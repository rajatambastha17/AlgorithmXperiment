package com.preps.javaconcepts.lambdasandstreamsconcept.streams.questions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamQuestions {
    public static void main(String[] args) {
        StreamQuestions s = new StreamQuestions();
//        s.question1();
//        s.question2();
//        s.question3();
//        s.question4();
//        s.question5();
//        s.question6();
//        s.question7();
//        s.question8();
//        s.question9();
//        s.question10();
//        s.question11();
//        s.question12();
//        s.question13();
//        s.question14();
//        s.question15();
        s.question16();
    }

    //  Find the longest string in a list of strings using Java streams
    private void question1() {
        List<String> strings = Arrays.asList("Blueberry", "Kiwi", "Pomegranate", "Watermelon", "Guava", "Pear", "Banana", "Apple");
        Optional<String> res = strings.stream().max(Comparator.comparingInt(String::length));
        List<String> string = strings.stream().filter(s -> (s.startsWith("B"))).toList();
        System.out.println(string + "\n");
    }

    // Calculate the average age of a list of Person objects using Java streams
    public void question2() {
        Person p1 = new Person("Rajat", 27);
        Person p2 = new Person("Palak", 25);
        Person p3 = new Person("Anushri", 29);
        Person p4 = new Person("Lipi", 27);
        Person p5 = new Person("Rahul", 32);

        List<Person> personList = Arrays.asList(p1, p2, p3, p4, p5);
        double average = personList.stream().mapToInt(Person::getAge).average().orElse(0);
        System.out.println(average + "\n");
    }

    // Check if a list of integers contains a prime number using Java streams
    public void question3() {
        List<Integer> integers = Arrays.asList(12, 3, 4, 23, 466, 51, 6, 24, 123, 4, 8, 9, 77, 67, 13);
        boolean containsPrime = integers.stream().anyMatch(this::isPrime);
        System.out.println(containsPrime + "\n");
    }

    // Merge two sorted lists into a single sorted list using Java streams
    public void question4() {
        List<Integer> list1 = Arrays.asList(1, 3, 5, 7, 9, 11, 1);
        List<Integer> list2 = Arrays.asList(2, 4, 6, 8, 10);
        List<Integer> merged = Stream.concat(list1.stream(), list2.stream()).sorted().toList();
        System.out.println("Merged List: " + merged + "\n");
    }

    // Given a stream of integers, return a stream containing only the even numbers.
    public void question5() {
        List<Integer> list1 = Arrays.asList(1, 2, 4, 6, 83, 5, 7, 9, 11, 12, 14, 17, 18, 20, 19, 22);
        List<Integer> result = list1.stream().filter(item -> item % 2 == 0).toList();
        System.out.println("Even numbers from the given stream: " + result + "\n");
    }

    // Given a stream of integers, return a stream containing only the positive numbers.
    public void question6() {
        List<Integer> list1 = Arrays.asList(1, -2, 4, -6, -83, -5, -7, 9, 11, 12, 14, -17, 18, -20, 19, 22);
        List<Integer> result = list1.stream().filter(item -> item > 0).toList();
        System.out.println("Positive numbers from the given stream: " + result + "\n");
    }

    // Given a stream of strings, return a stream containing only the strings that start with the letter 'A' (case-insensitive).
    public void question7() {
        List<String> strings = Arrays.asList("Ashley", "Anushri", "Ashwini", "Bernie", "Natasha", "Simran", "Rahul", "Aman", "Aryan");
        List<String> result = strings.stream().filter(string -> string.startsWith("A")).toList();
        System.out.println("Strings starting with 'A': " + result + "\n");
    }

    // Given a stream of integers, return a stream containing the square of each number
    public void question8() {
        List<Integer> integerList = Arrays.asList(1, 2, 4, 6, 83, 5, 7, 9, 11, 12, 14, 17, 18, 20, 19, 22);
        List<Integer> squaredInts = integerList.stream().map(item -> item * item).toList();
        System.out.println("Square of the numbers from the list: " + squaredInts + "\n");
    }

    // Given a stream of strings, return a stream containing the length of each string.
    public void question9() {
        List<String> strings = Arrays.asList("Ashley", "Anushri", "Ashwini", "Bernie", "Natasha", "Simran", "Rahul", "Aman", "Aryan");
        List<Integer> lengthOfStrings = strings.stream().map(String::length).toList();
        System.out.println("Length of the strings from the list is: " + lengthOfStrings + "\n");
    }

    // Given a stream of strings, return a stream containing the uppercase version of each string.
    public void question10() {
        List<String> strings = Arrays.asList("Ashley", "Anushri", "Ashwini", "Bernie", "Natasha", "Simran", "Rahul", "Aman", "Aryan");
        List<String> uppercaseOfStrings = strings.stream().map(String::toUpperCase).toList();
        System.out.println("Length of the strings from the list is: " + uppercaseOfStrings + "\n");
    }

    // Given a stream of integers, find the first even number.  (Return an appropriate indicator if no even number exists).
    public void question11() {
        List<Integer> integerList = Arrays.asList(1, 83, 5, 7, 9, 22, 2, 4, 6, 11, 12, 14, 17, 18, 20, 19);
        Optional<Integer> firstitem = integerList.stream().filter(item -> item % 2 == 0).findFirst();
        System.out.println("First even number in the list is: " + firstitem.get() + "\n");
    }

    // Given a stream of strings, find the first string that contains the substring "ini"
    public void question12() {
        List<String> strings = Arrays.asList("Ashley", "Anushri", "Ashwin", "Bernini", "Natasha", "Simran", "Rahul", "Aman", "Aryan");
        Optional<String> containsini = strings.stream().filter(element -> element.contains("ini")).findFirst();
        System.out.println("First occurrence of ini from the list is: " + containsini.get() + "\n");
    }

    // Given a stream of integers, return a stream containing the squares of the even numbers.
    public void question13() {
        List<Integer> integerList = Arrays.asList(1, 83, 5, 7, 9, 22, 2, 4, 6, 11, 12, 14, 17, 18, 20, 19);
        List<Integer> evenSquaredList = integerList.stream().filter(item -> item % 2 == 0).map(item -> item * item).toList();
//        List<Integer> evenSquaredList = integerList.stream().map(item -> item * item).filter(item -> item % 2 == 0).toList();
        System.out.println("All even numbers squared from the list are: " + evenSquaredList + "\n");
    }

    public void question14() {
        List<String> strings = Arrays.asList("Blueberry", "Kiwi", "Pomegranate", "Watermelon", "Guava", "Pear", "Banana", "Apple", "Strawberry");
        List<String> resultString = strings.stream().filter(string -> string.length() > 5).map(String::toUpperCase).toList();
        System.out.println("Uppercase strings whose length is more than 5: " + resultString);
    }

    public void question15() {
        List<Integer> integerList = Arrays.asList(1, 83, 5, 7, 9, 22, 2, 4, 6, 11, 12, 14, 17, 18, 20, 233, 19);
        int result = integerList.stream().mapToInt(Integer::intValue).max().getAsInt();
        System.out.println("Largest number from the List is: " + result + "\n");
    }

    public void question16() {
        List<String> strings = Arrays.asList("Blueberry", "Kiwi", "Pomegranate", "Watermelon", "Guava", "Pear", "Banana", "Apple", "Strawberry");
        Map<Integer, List<String>> result = strings.stream().collect(Collectors.groupingBy(String::length));
        System.out.println("Map of Strings with length as key: " + result + "\n");
    }

    private boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

@Data
@NoArgsConstructor
@AllArgsConstructor
class Person {
    private String name;
    private int age;
}
