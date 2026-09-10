package com.preps.javaconcepts.executorframework.executorpoc.taskmanagement.customthreadpool;

import com.preps.javaconcepts.executorframework.executorpoc.taskmanagement.tasks.ReportTask;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class CustomThreadPoolModule {
    public static void run() {
        System.out.println("\n=== Custom ThreadPoolExecutor Module ===");

        // Create a custom ThreadPoolExecutor
        ThreadPoolExecutor executor = new ThreadPoolExecutor(2,
                4,
                60,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(4),
                new ThreadPoolExecutor.CallerRunsPolicy()
        );

        // Submit tasks
        List<Future<String>> futures = new ArrayList<>();
        for (int i = 1; i <= 6; i++) { // More tasks than queue can handle
            System.out.println("Submitting task " + i + ", active threads: " + executor.getActiveCount() + ", queue size: " + executor.getQueue().size());
            futures.add(executor.submit(new ReportTask("Custom Report " + i)));
        }

        // Retrieve and print results
        for (int i = 0; i < futures.size(); i++) {
            try {
                System.out.println(futures.get(i).get()); // Wait for and print result
            } catch (Exception e) {
                System.out.println("Error in task " + (i + 1) + ": " + e.getMessage());
            }
        }

        // Shutdown
        executor.shutdown();
        try {
            if (!executor.awaitTermination(10, TimeUnit.SECONDS)) {
                executor.shutdownNow();
                System.out.println("Executor did not terminate in time, forced shutdown.");
            }
        } catch (InterruptedException e) {
            executor.shutdownNow();
            System.out.println("Shutdown interrupted: " + e.getMessage());
        }
    }
}
