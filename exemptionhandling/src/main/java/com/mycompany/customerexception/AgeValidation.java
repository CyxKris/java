package com.mycompany.customerexception;

public class AgeValidation {

    void validate() throws InvalidAgeException {

        int age = 15;

        if (age < 18) {
            throw new InvalidAgeException("You are not old enough to vote!");
        } else {
            System.out.println("Your are old enough to vote!");
        }

        // try {



        // } catch (Exception e) {
        //     System.out.println(e);
        // }
    }
}
