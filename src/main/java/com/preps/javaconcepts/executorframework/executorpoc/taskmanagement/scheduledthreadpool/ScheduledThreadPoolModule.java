package com.preps.javaconcepts.executorframework.executorpoc.taskmanagement.scheduledthreadpool;

import com.preps.javaconcepts.executorframework.executorpoc.taskmanagement.tasks.LogTask;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoolModule {
    public static void run() {
        System.out.println("\n=== Scheduled Thread Pool Module ===");

        // Create a scheduled thread pool with 1 thread
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        // Schedule a task to run every 2 seconds after a 1-second delay
        scheduler.scheduleAtFixedRate(new LogTask("Status Check"), 1, 2, TimeUnit.SECONDS);

        // Let it run for 6 seconds, then shut down
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            System.out.println("ScheduledThreadPoolModule interrupted: " + e.getMessage());
            Thread.currentThread().interrupt();
        }

        // Shutdown Scheduler
        scheduler.shutdown();
        try {
            if (scheduler.awaitTermination(5, TimeUnit.SECONDS)) {
                scheduler.shutdownNow();
            }
        } catch (InterruptedException e) {
            scheduler.shutdownNow();
        }
    }
}
