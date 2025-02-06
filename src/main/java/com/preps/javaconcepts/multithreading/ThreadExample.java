package com.preps.javaconcepts.multithreading;

public class ThreadExample implements Runnable {

    @Override
    public void run() {
        System.out.println("Running from the run() method");
    }

    public String somethingToDoMethod(String message) {
        return message + " Received!";
    }

    public ThreadExample() {
        System.out.println("Instantiated!");
    }
}

class Runner {
    public static void main(String[] args) {

        ThreadExample th = new ThreadExample();
        System.out.println(th.somethingToDoMethod("Hello there! Let's start a Thread!!"));
        Thread t = new Thread(th);
        t.start();
    }
}
