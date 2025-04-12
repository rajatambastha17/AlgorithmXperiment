package com.preps.javaconcepts.lambdasandstreamsconcept.lambdas;

public class LambdaImpl {
    public static void main(String[] args) {

        FunctionalInterfaceDemo func = (int radius) -> {
            double area = 3.14 * Math.pow(radius, 2);
            return "Area of the circle is: " + area;

        };
        String result = func.area(12);
        System.out.println(result);
    }
}
