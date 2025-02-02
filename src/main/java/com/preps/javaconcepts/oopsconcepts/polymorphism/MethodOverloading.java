package com.preps.javaconcepts.oopsconcepts.polymorphism;

public class MethodOverloading {

    public double area(double measure) {
        return Math.pow(measure, 2);
    }

    public double area(double length, double width) {
        return length * width;
    }

    public double area(double length, double width, double height) {
        return length * width * height;
    }

    public void StudentId(String name, int roll_no) {
        System.out.println("Name :" + name + " "
                + "Roll-No :" + roll_no);
    }

    // Method 2
    public void StudentId(int roll_no, String name) {
        // Again printing name and id of person
        System.out.println("Roll-No :" + roll_no + " "
                + "Name :" + name);
    }

}
