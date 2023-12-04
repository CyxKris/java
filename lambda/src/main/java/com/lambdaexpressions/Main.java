package com.lambdaexpressions;

public class Main {

    public static void main(String[] args) {
        // ?Lambda with inferred types, and also with a body
        Calculation calculation = (num1, num2) -> {
            return num1 + num2;
        };

        System.out.println("Calculation of 89 + 35 is " + calculation.add(89, 35));

        IAverage average = (double number1, double number2, double number3) -> (number1 + number2 + number3) / 3;

        System.out.println("\nThe average of 55.4, 304.7, and 25.0 is " + average.calculateAverage(55.4, 304.7, 25.0));
    }

}
