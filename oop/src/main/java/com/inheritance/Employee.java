package com.inheritance;

public class Employee {
    
    // VARIABLES
    String id = "ID-9002";
    String name = "Jonathan Smith";
    String department = "IT";

    // METHODS
    void displayInfo() {
        System.out.println("\nYOUR EMPLOYEE DETAILS--------------------------------");
        System.out.println("ID: " + id + "\nNAME: " + name + "\nDEPARTMENT: " + department);
    }
}
