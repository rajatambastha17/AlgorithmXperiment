package com.preps.javaconcepts.lambdasandstreamsconcept.lambdas.functionalinterfaces;

public interface ConcreteFunctional {

    String printer(String arg);

    default String display() {
        return "default method";
    }

    static String displayStatic() {
        return "Static method from interface";
    }
}
