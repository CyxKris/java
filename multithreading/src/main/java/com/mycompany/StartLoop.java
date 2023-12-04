package com.mycompany;

public class StartLoop implements Runnable {
    public void run() {
        for (int k = 20000; k <= 25000; k++) {
            System.out.print(k + ", ");
        }
    }
}
