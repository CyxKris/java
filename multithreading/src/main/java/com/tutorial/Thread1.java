package com.tutorial;

public class Thread1 extends Thread {

    @Override
    public void run() {
        System.out.println("\n");
        for (int i = 0; i < 5; i++) {
            System.out.println("Inside thread1: " + i);
        }

    }

}
