package com.cyx;

public class Counter implements Runnable {

    @Override
    public void run() {

        int i = 0;
        while (i <= 100) {
            if (i != 100) {
                System.out.print(i + " , ");
            } else {
                System.out.println(i + " . ");
            }
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            i++;
        }
    }

    public static void main(String[] args) {

        try {

            Counter counter = new Counter();
            Thread thread = new Thread(counter);

            thread.start();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
