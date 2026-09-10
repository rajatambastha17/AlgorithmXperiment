package com.preps.javaconcepts.oopsconcepts.abstraction.interfaces;

public class InterfaceImpl implements ParentInterface {
    @Override
    public void add(int a, int b) {
        System.out.println(a + b);
    }

    @Override
    public void multiply(int a, int b) {
        System.out.println(a * b);
    }

    @Override
    public void subtract(int a, int b) {
        System.out.println(a - b);
    }
}
