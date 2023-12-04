package com.tutorial;

public class Main {

    public static void main(String[] args) {
        // System.out.println("Main is starting...");

        // Thread thread = new Thread1();
        // thread.start();

        // Thread thread2 = new Thread(() -> {
        //     for (int i = 0; i < 6; i++) {
        //         System.out.println("Inside " + i);
        //     }
        // });

        // thread2.start();

        // System.out.println("\nMain is exiting...");

        System.out.println("Main is starting...\n");


        Stack stack = new Stack(5);

        new Thread(() -> {
            int counter = 0;

            while (++counter < 10)
                System.out.println("Pushed: " + stack.push(100));

        }, "Pusher").start();


        new Thread(() -> {
            int counter = 0;

            while (++counter < 10)
                System.out.println("Popped: " + stack.pop());
        }, "Popper").start();


        System.out.println("\nMain is exiting...");
    }
}
