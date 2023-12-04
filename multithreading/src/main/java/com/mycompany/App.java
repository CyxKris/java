package com.mycompany;

public class App 
{
    public static void main( String[] args )
    {
        try {
            StartLoop startLoop = new StartLoop();
            Thread thread = new Thread(startLoop);
            thread.start();
            // thread.join(); // sort of pauses the multithreading. Makes the particular thread a priority

            System.out.println("\n");

            CountingLoop countingLoop = new CountingLoop();
            countingLoop.start();

            System.out.println("\n");
            NewLoop newLoop = new NewLoop();
            newLoop.start();

            System.out.println("\n");
            for (int j = 6000; j <= 10000; j++) {
                System.out.print(j + ", ");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
