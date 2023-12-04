package com.mycompany.customerexception;

public class FinallyExample {

    void divide() {

        try {
            int result = 6 / 0;
            System.out.println("The result is " + result);

        } catch (ArithmeticException e) {
            System.out.println(e);
        } finally {
            System.out.println("\nTHE DIVIDE METHOD IS DONE RUNNING!");
        }
    }
}
