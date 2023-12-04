package com.lambdaexpressions;

public class LambdaExpressionDemo {

    public static void main(String[] args) {
        // ?Lambda 1: Using basic lambda
        // the interface must be a functional interface (only containing one method) for this to work;
        // FunctionalA functionalA1 = (int num1, int num2) -> num1 + num2;

        // System.out.println("5 + 5 = " + functionalA1.doWork(5, 5));


        LambdaExample lambdaExample = new LambdaExample();
        System.out.println("\n10 + 50 = " + lambdaExample.doWork(10, 50));
        lambdaExample.display();
        System.out.println("\nThe average of 90 and 100 is: " + lambdaExample.average(90, 100));
    }

}
