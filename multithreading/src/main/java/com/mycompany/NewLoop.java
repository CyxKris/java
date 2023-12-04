package com.mycompany;

public class NewLoop extends Thread {
    public void run() {
        for (int x = 10000; x <= 15000; x++) {
            System.out.print(x + ", ");
        }
    }
}
