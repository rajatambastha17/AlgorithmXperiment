package com.preps.javaconcepts.oopsconcepts.abstraction;

public class AbstractClass {
    public static void main(String[] args) {
        Car a = new Car();
    }
}

abstract class Engine {
    String manufacturer;

    public Engine() {
    }

    public Engine(String manufacturer) {
        this.manufacturer = manufacturer;
        System.out.println("Engine constructor called!");
    }

    abstract void engineType();

    abstract void enginePower();

    abstract void enginePurpose();
}

abstract class Train extends Engine {

    int yearOfMake;


    public Train(String manufacturer, int yearOfMake) {
        super(manufacturer);
        this.yearOfMake = yearOfMake;
    }

    @Override
    void engineType() {
        System.out.println("Train Engine");
    }

    @Override
    void enginePower() {
        System.out.println("100 Hp");
    }
}

class Car extends Engine {

    public Car() {
        super();
    }

    public Car(String manufacturer) {
        super(manufacturer);
        System.out.println("Car is created");
    }

    @Override
    void engineType() {
        System.out.println("Car Engine");
    }

    @Override
    void enginePower() {
        System.out.println("1.5 L");
    }

    @Override
    void enginePurpose() {
        System.out.println("Power the car");
    }
}