package com.cyx;

public class WorkerThread implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
    

    public static void main(String[] args) {
        try {

            WorkerThread workerThread = new WorkerThread();
            Thread thread = new Thread(workerThread);

            thread.start();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
