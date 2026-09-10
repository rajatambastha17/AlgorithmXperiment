package com.preps.javaconcepts.executorframework.executorpoc.taskmanagement.fixedthreadpool;

import com.preps.javaconcepts.executorframework.executorpoc.taskmanagement.tasks.LogTask;
import com.preps.javaconcepts.executorframework.executorpoc.taskmanagement.tasks.ReportTask;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class FixedThreadPoolModule {

    public static void run() {
        System.out.println("\n=== Fixed Thread Pool Module ===");

        // Create a fixed thread pool with 2 threads
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Submit tasks
        List<Future<String>> futures = new ArrayList<>();
        futures.add(executor.submit(new ReportTask("Sales Report")));
        futures.add(executor.submit(new ReportTask("Inventory Report")));
        executor.execute(new LogTask("Processing started"));

        // Retrieve Results
        for (Future<String> future : futures) {
            try {
                System.out.println(future.get());
            } catch (InterruptedException | ExecutionException e) {
                System.out.println("Error in FixedThreadPoolModule: " + e.getMessage());
            }
        }
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
