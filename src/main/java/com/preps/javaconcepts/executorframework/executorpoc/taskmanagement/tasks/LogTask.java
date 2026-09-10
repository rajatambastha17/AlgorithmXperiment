package com.preps.javaconcepts.executorframework.executorpoc.taskmanagement.tasks;

public class LogTask implements Runnable {
    private final String message;

    public LogTask(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("Log: " + message + " by thread " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            System.out.println("LogTask interrupted: " + message);
            Thread.currentThread().interrupt(); // Restore interrupt status
        }

    }
}
