package com.preps.javaconcepts.executorframework.executorpoc.taskmanagement;

import com.preps.javaconcepts.executorframework.executorpoc.taskmanagement.cachedthreadpool.CachedThreadPoolModule;
import com.preps.javaconcepts.executorframework.executorpoc.taskmanagement.customthreadpool.CustomThreadPoolModule;
import com.preps.javaconcepts.executorframework.executorpoc.taskmanagement.fixedthreadpool.FixedThreadPoolModule;
import com.preps.javaconcepts.executorframework.executorpoc.taskmanagement.scheduledthreadpool.ScheduledThreadPoolModule;
import com.preps.javaconcepts.executorframework.executorpoc.taskmanagement.singlethread.SingleThreadPoolModule;

public class Main {
    public static void main(String[] args) {
        System.out.println("======Starting Task Management System======");

        FixedThreadPoolModule.run();
        CachedThreadPoolModule.run();
        SingleThreadPoolModule.run();
        ScheduledThreadPoolModule.run();
        CustomThreadPoolModule.run();

        System.out.println("========Task Management ran successfully========");
    }
}
