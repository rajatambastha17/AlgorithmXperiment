package com.preps.javaconcepts.equalsandhascodeconcept;

public class Practice {
    public static void main(String[] args) {
        Integer a = 56;
        Integer b = 56;
        Double c = 56.0;
        System.out.println(a.equals(b));
//        System.out.println(a==c);
        A aa = new A();
        A ab = new A();
        B bb = new B();
        System.out.println(aa.equals(ab));
    }
}

class A {

}

class B {

}