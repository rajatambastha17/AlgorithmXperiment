package com.preps.javaconcepts.oopsconcepts.inheritance.multipleinheritance;

public class Runner {
    public static void main(String[] args) {
        Child c = new Child();
        c.print_one();
        c.print_two();
        CheckMultiple2 ch = new ChildMultiple();
        ch.checkMultiple();
//        ch.checkMultiple(12);
    }
}
