package com.preps.javaconcepts.oopsconcepts.polymorphism;

public class Runner {
    public static void main(String[] args) {
        MethodOverloading methodOverloading = new MethodOverloading();
        System.out.println("Area of square with side 4cm: " + methodOverloading.area(4) + "cm");
        System.out.println("Area of rectangle with length 4cm and width 5cm: " + methodOverloading.area(4, 5) + "cm");

        methodOverloading.StudentId(24, "Rajat");
        methodOverloading.StudentId("Rajat", 67);
    }
}
