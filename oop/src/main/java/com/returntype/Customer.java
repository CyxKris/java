package com.returntype;

public class Customer {
    

    void deposit() {
        System.out.println("Customer deposit is 30K");
    }

    String transfer() {
        System.out.println("Customer transferred 10K to another account");
        return "Transaction Successful";
    }

    int changePin() {
        System.out.println("Your old PIN: " + 1234);
        System.out.print("Your new PIN: ");
        return 3285;
    }

    Customer blueprintObj() {
        System.out.println("This is a method that returns an object of the class 'Customer'...");
        return this;
        // return new Customer();
    }
}
