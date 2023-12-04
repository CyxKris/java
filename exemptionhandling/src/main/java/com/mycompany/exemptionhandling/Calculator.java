package com.mycompany.exemptionhandling;

public class Calculator {
    static int num1 = 50;
    static int num2 = 0;
    static int result;

    static void divide() {

        try {
            result = num1 / num2;
            System.out.println("The result of dividing " + num1 + " by " + num2 + " is: " + result);

        } catch (ArithmeticException e) {

            System.out.println(e);
        }
    }
}
