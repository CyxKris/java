package com.inheritance;

public class EmployeeV2 extends Employee {
    
    // VARIABLES
    String gender = "MALE";
    String email = "johnsmith@gmail.com";
    String address = "Lagos, Nigeria";

    Employee employee = new Employee();
    
    void newDisplay() {
        System.out.println("\nThis is from the inherited EmployeeV2 class...");
        employee.displayInfo();
        System.out.println("GENDER: " + gender + "\nEMAIL: " + email + "\nADDRESS: " + address + "\n");
    }
}
