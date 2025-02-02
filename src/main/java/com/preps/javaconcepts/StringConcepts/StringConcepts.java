package com.preps.javaconcepts.StringConcepts;

import java.util.Arrays;
import java.util.stream.Stream;

public class StringConcepts {

    public static void main(String[] args) {

//      Both of these share a same memory address in heap and the string constant pool
        String s1 = "My name is Anthony";
        String s2 = "My name is Anthony";

//      This represents a new String. It has the same value but different memory address
        String s3 = new String("My name is Anthony");
        System.out.println("Eqauls method for s1 and s2 returns: " + (s1.equals(s2)));
        System.out.println("Eqauls method for s1 and s3 returns: " + (s1.equals(s3)));
        System.out.println("Eqauls method for s2 and s3 returns: " + (s2.equals(s3)));

        System.out.println("== method for s1 and s2 returns: " + (s1 == s2));
        System.out.println("== method for s1 and s3 returns: " + (s1 == s3));
        System.out.println("== method for s2 and s3 returns: " + (s2 == s3));

        String subEx = "This is an example of substring";

//      Returns the index from where the substring is started
        int index = subEx.lastIndexOf("ple");
        System.out.println(index + "\n");

//      This splits the given string into string array
        String[] stringArray = subEx.split(" ");

//      Printing the string array
        Arrays.stream(stringArray).forEach(System.out::println); //This will print the array elements

    }
}
