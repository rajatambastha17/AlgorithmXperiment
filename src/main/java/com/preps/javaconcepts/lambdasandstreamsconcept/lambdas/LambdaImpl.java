package com.preps.javaconcepts.lambdasandstreamsconcept.lambdas;

import com.preps.javaconcepts.lambdasandstreamsconcept.lambdas.functionalinterfaces.ConcreteFunctional;
import com.preps.javaconcepts.lambdasandstreamsconcept.lambdas.functionalinterfaces.IsEven;
import com.preps.javaconcepts.lambdasandstreamsconcept.lambdas.functionalinterfaces.Printer;
import com.preps.javaconcepts.lambdasandstreamsconcept.lambdas.functionalinterfaces.Square;

import java.util.Comparator;
import java.util.concurrent.atomic.AtomicReference;

public class LambdaImpl {
    public static void main(String[] args) {

        FunctionalInterfaceDemo func = (int radius) -> {
            double area = 3.14 * Math.pow(radius, 2);
            return "Area of the circle is: " + area;

        };
        String result = func.area(12);
        System.out.println(result);

        Printer pr = (str) -> System.out.println(str);
        pr.print("Hello lambda");

        Square s = (a) -> a * a;
        System.out.println(s.compute(12));

        IsEven e = (y) -> y % 2 == 0;
        System.out.println(e.check(34));

        Comparator<Integer> comp = (a, b) -> a - b;
        System.out.println(comp.compare(34, 21));
        int count = 0;

        Runnable r = () -> {
            // System.out.println(count);
        };
        count++;

        ConcreteFunctional cf = (str) -> "Hello there, " + str + "!";
        String res = cf.printer("Rajat");
        System.out.println(res);
        System.out.println(cf.display());
        System.out.println(ConcreteFunctional.displayStatic());
    }
}
