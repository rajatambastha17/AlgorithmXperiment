package com.preps.javaconcepts.lambdasandstreamsconcept.functionalinterfaces;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterfaceExample {
    public static void main(String[] args) {
        Consumer<String> printConsumer = (s) -> System.out.print(s+" ");
        printConsumer.accept("Hello!");

        List<String> names = List.of("Alice", "Bob", "Charlie");
        names.forEach(printConsumer);
    }
}
