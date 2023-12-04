package com.mycompany.customerexception;

public class Main {
    public static void main(String[] args) {

        try {
            AgeValidation ageValidation = new AgeValidation();
            ageValidation.validate();

        } catch (InvalidAgeException e) {
            System.out.println(e);
        }

        FinallyExample finallyExample = new FinallyExample();
        finallyExample.divide();
    }
}
