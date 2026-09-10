package com.preps.javaconcepts.oopsconcepts.abstraction.interfaces;

public class Chaining implements Child {
    @Override
    public void displayChild() {
        System.out.println("Displaying child");
    }

    @Override
    public void displayParent() {
        System.out.println("Displaying parent");
    }
}
