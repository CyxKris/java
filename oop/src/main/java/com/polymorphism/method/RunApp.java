package com.polymorphism.method;

import java.util.Scanner;


public class RunApp {
    public static void main(String[] args) {

        // INITIALIZING A 'scanner' OBJECT FROM THE SCANNER
        Scanner scanner = new Scanner(System.in);

        // VARIABLES
        // int firstNum;
        // int secondNum;

        // INITIALIZING A 'calculator' OBJECT FROM THE 'CALCULATOR' CLASS
        Calculator calculator = new Calculator();
        calculator.add(30, 50);

        scanner.close();

    }
}
