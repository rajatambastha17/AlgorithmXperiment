package com.preps.javaconcepts.multithreading;

public class MultithreadingDemonstration {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        // Simulate multiple users accessing the same account
        UserThread t1 = new UserThread(account, "Alice", 600);
        UserThread t2 = new UserThread(account, "Bob", 500);
        UserThread t3 = new UserThread(account, "Charlie", 400);

        t1.start();
        t2.start();
        t3.start();
    }
}

class BankAccount {

    private int balance = 1000;

    // Synchronized method to avoid race conditions
    public synchronized void withdraw(String user, int amount) {
        if (balance >= amount) {
            System.out.println(user + " is trying to withdraw ₹" + amount);
            try {
                Thread.sleep(100); // simulate processing time
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
            balance -= amount;
            System.out.println(user + " successfully withdrew ₹" + amount + ". Remaining balance: ₹" + balance);
        } else {
            System.out.println(user + " tried to withdraw ₹" + amount + " but insufficient balance!");
        }
    }
}

class UserThread extends Thread {
    private BankAccount account;
    private String user;
    private int amount;

    public UserThread(BankAccount account, String user, int amount) {
        this.account = account;
        this.user = user;
        this.amount = amount;
    }

    public void run() {
        account.withdraw(user, amount);
    }
}