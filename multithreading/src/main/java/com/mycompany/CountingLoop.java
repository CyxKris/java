package com.mycompany;

public class CountingLoop extends Thread {
    public void run() {
        for (int i = 1; i <= 5000; i++) {
            System.out.print(i + ", ");
        }
    }
}
