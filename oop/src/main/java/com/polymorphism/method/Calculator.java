package com.polymorphism.method;

public class Calculator {
    
    // VARIABLES
    int firstNum = 20;
    int secondNum = 30;
    int result;

    // METHODS
    // ?Method overloading...
    void add() {

        result = firstNum + secondNum;
        System.out.println("The result of adding " + secondNum + " to " + firstNum + " is: " + result);
    }

    void add(int a) {
        this.firstNum = a;
        result = firstNum + secondNum;

        System.out.println("The value of the firstNum variable is now: " + firstNum);
        System.out.println("The result of adding " + secondNum + " to " + firstNum + " is: " + result);
    }

    void add(int a, int b) {
        this.firstNum = a;
        this.secondNum = b;
        result = firstNum + secondNum;

        System.out.println("The value of the firstNum variable is now: " + firstNum);
        System.out.println("The value of the secondNum variable is now: " + secondNum);
        System.out.println("The result of adding " + secondNum + " to " + firstNum + " is: " + result);
    }
}
