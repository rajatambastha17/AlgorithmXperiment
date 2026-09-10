package com.preps.javaconcepts.oopsconcepts.inheritance.multipleinheritance;

public class Child implements Three {
    @Override
    public void print_one() {
        System.out.println("One");
    }

    @Override
    public void print_two() {
        System.out.println("Two");
    }
}
