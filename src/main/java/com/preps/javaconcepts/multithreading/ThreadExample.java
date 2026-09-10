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

    public static void main(String[] args) throws InterruptedException {

        ThreadExample th = new ThreadExample();
        Threadt threadt = new Threadt();
        threadt.start();
        Thread thr = new Thread(threadt);
        thr.start();
        System.out.println(th.somethingToDoMethod("Hello there! Let's start a Thread!!"));
        Thread t = new Thread(th);
        t.start();

        Thread tt = new Threadt();
        tt.start();

        // Ensuring the threads run one after another ->
        Thread t1 = new Thread(() -> {
            System.out.println("Running thread T1");
            System.out.println("\nCompleted running thread T1\n");
        });

        Thread t2 = new Thread(() -> {
            System.out.println("Running thread T2");
            try {
                t1.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Completed running thread T2\n");
        });

        Thread t3 = new Thread(() -> {
            System.out.println("Running thread T3");
            try {
                t2.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Completed running thread T3\n");
        });
        t2.start();
        t3.start();
        t1.start();

        // Thread can't be started twice -> illegalThreadStateException
        // t2.start();

        System.out.println("\n\n");
        Runnable1 r1 = new Runnable1();
        Runnable2 r2 = new Runnable2();

        Thread rb1 = new Thread(r1);
        Thread rb2 = new Thread(r2);
        rb1.start();
        rb2.start();
    }
}

class Runnable1 implements Runnable {

    @Override
    public void run() {
        System.out.println("Running Runnable1");
    }
}

class Runnable2 implements Runnable {

    @Override
    public void run() {
        System.out.println("Running Runnable2");
    }
}

class Threadt extends Thread {

    public void run() {
        System.out.println("Running from Threadt");
    }
}