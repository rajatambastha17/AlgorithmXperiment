package com.preps.javaconcepts.oopsconcepts.abstraction.interfaces.functionalinterface;

@FunctionalInterface
public interface Calculate {
    int calculate(int x);

    default String doSomething(){
        return "Hello";
    }
}
