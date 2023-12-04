package com.cyx;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimpleThreadPool {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 5; i++) {
            Runnable worker = new WorkerThread();
            executorService.execute(worker);
        }

        executorService.shutdown();

        while (!executorService.isTerminated()) {
            // System.out.println("Thread pool");
        }

        System.out.println("\nFinished all threads");

    }
    
    /*
     * Create a multi-threaded application with 2 or more threads, trying to access a shared data/resource
     * E.G: A file
     * Use a monitor or synchronized block to protect the integrity of the data/resource... preventing deadlocks
     */
}
