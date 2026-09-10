package com.preps.javaconcepts.executorframework.executorpoc.taskmanagement.singlethread;

import com.preps.javaconcepts.executorframework.executorpoc.taskmanagement.tasks.LogTask;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SingleThreadPoolModule {

    public static void run() {
        System.out.println("\n=== Single Thread Executor Module ===");

        // Create a single thread executor
        ExecutorService executor = Executors.newSingleThreadExecutor();

        // Submit tasks to run sequentially
        executor.execute(new LogTask("Sequential Task 1"));
        executor.execute(new LogTask("Sequential Task 2"));
        executor.execute(new LogTask("Sequential Task 3"));

        // Shutdown Executor
        executor.shutdown();
        try {
            if (!executor.awaitTermination(5, TimeUnit.SECONDS)) {
                executor.shutdownNow();
            }
        } catch (InterruptedException e) {
            executor.shutdownNow();
        }
    }
}
