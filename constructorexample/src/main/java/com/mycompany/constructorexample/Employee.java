package com.mycompany.constructorexample;

public class Employee {
    //Employee class
    //employee id, name, department, email, phone number, state
    //should have 6 constructors and the arguments should be gotten from user input

    String id;
    String name;
    String department;
    String email;
    String phone;
    String state;

    // *THE CONSTRUCTORS
    Employee() {

    }
    
    Employee(String id) {
        this.id = id;
    }

    Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    Employee(String id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    Employee(String id, String name, String department, String email) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.email = email;
    }

    Employee(String id, String name, String department, String email, String phone) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.email = email;
        this.phone = phone;
    }

    Employee(String id, String name, String department, String email, String phone, String state) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.email = email;
        this.phone = phone;
        this.state = state;
    }

    void displayData() {
        System.out.println("\nYOUR DATA");
        System.out.println("--------------------------------");
        System.out.println("ID: " + id + "\nNAME: " + name + "\nDEPARTMENT: " + department + "\nEMAIL: " + email + "\nPHONE: " + phone + "\nSTATE: " + state + "\n");
    }
}
