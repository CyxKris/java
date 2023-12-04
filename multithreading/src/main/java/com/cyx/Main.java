package com.cyx;

public class Main {
    public static void main(String[] args) {
        // Counter counter = new Counter();
        // Thread thread = new Thread(counter);

        // thread.start();

        FileClass fileClass = new FileClass();

        // ?THREAD 1 - WRITES TO  FILE
        new Thread(() -> {
            fileClass.WriteToFile();
        }, "File Writer").start();

        // ?THREAD 2 - READS FROM FILE
        new Thread(() -> {
            fileClass.ReadFromFile();
        }, "File Reader").start();
    }
}
