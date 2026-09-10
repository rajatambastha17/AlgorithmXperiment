package com.preps.javaconcepts.oopsconcepts.inheritance.multipleinheritance;

public class ChildMultiple implements CheckMultiple1,CheckMultiple2{
    @Override
    public void checkMultiple() {
        System.out.println("checkMultiple from23");
    }

    @Override
    public void checkMultiple(int check) {
        System.out.println(check+" from checkMultiple1");
    }
}
