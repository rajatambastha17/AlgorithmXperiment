package com.preps.javaconcepts.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HelloGeneric<T, U> {
    T obj1;
    U obj2;

    HelloGeneric(T obj1, U obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public T getTValue() {
        return this.obj1;
    }

    public U getUValue() {
        return this.obj2;
    }
}

class TestGeneric {
    public static void main(String[] args) {
        HelloGeneric<String, Integer> helloGeneric = new HelloGeneric<>("Hi, this is a generic class object", 45);
        System.out.println(helloGeneric.getTValue());
        System.out.println(helloGeneric.getUValue());
        ArrayList<int[]> arr = new ArrayList<>();

        arr.add(new int[]{11, 2, 3, 4, 2, 1, 4});
        for (int[] a : arr) {
            for (int j : a) {
                System.out.println(j);
            }
        }

        ArrayList a = new ArrayList();
        a.add("Rajat");
        a.add(123);
        a.add(123.6562);
        System.out.println(a);
    }

}