package com.abstractclass;

public class CompleteStudent extends Student {
    
    // Fixing up the abstract method from the Student class
    void display() {
        System.out.println("I am fixed!!!");
        System.out.println("ID: " + id + "\nNAME: " + name + "\n");
    }
}
