package com.preps.javaconcepts.oopsconcepts.abstraction.interfaces.diamondsolution;

public class Implementor implements Child1, Child2{
    @Override
    public void showParent() {
        System.out.println("From parent");
    }
}
