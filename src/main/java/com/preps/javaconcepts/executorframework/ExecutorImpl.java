package com.preps.javaconcepts.executorframework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorImpl {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(
                () -> System.out.println("Thread is running")
        );
        executorService.shutdown();

    }
}