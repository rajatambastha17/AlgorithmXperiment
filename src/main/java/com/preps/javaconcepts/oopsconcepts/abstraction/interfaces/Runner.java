package com.preps.javaconcepts.oopsconcepts.abstraction.interfaces;

public class Runner {
    public static void main(String[] args) {
        ParentInterface p = new InterfaceImpl();
        p.add(112, 322);
        p.subtract(435, 234);
        p.multiply(2345, 765);
        System.out.println("Final variable from interface: " + ParentInterface.pi);

        Chaining chain = new Chaining();
        chain.displayChild();
        chain.displayParent();
    }
}
