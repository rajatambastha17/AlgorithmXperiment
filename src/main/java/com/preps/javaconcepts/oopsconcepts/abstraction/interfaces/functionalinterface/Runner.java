package com.preps.javaconcepts.oopsconcepts.abstraction.interfaces.functionalinterface;

public class Runner {
    public static void main(String[] args) {

        int x = 12;
        Calculate c = (a) -> a + a;
        int ans = c.calculate(x);
        String s = c.doSomething();
        System.out.println(s + " " + ans);
    }
}
