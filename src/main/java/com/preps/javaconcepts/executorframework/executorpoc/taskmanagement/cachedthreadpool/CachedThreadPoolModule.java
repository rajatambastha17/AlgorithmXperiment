package com.preps.javaconcepts.executorframework.executorpoc.taskmanagement.cachedthreadpool;

import com.preps.javaconcepts.executorframework.executorpoc.taskmanagement.tasks.LogTask;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class CachedThreadPoolModule {
    public static void run() {

        System.out.println("\n=== Cached Thread Pool Module ===");

        // Create a cached thread pool
        ExecutorService executor = Executors.newCachedThreadPool();

        for (int i = 1; i <= 10; i++) {
            executor.execute(new LogTask("Task " + i));
        }
        // Shutdown the Executor
        executor.shutdown();
        try {
            if (!executor.awaitTermination(5, TimeUnit.SECONDS)) {
                executor.shutdownNow();
            }
        } catch (InterruptedException ex) {
            executor.shutdownNow();
        }
    }
}
