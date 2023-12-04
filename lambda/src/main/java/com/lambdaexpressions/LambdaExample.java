package com.lambdaexpressions;

public class LambdaExample implements FunctionalA {

    @Override
    public int doWork(int a, int b) {
        return a + b;
    }

    @Override
    public void display() {
        System.out.println("\nThis method displays something...");
    }

    @Override
    public String average(int a, int b) {
        int averageResult = (a + b) / 2;
        return Integer.toString(averageResult);
    }
    
}
