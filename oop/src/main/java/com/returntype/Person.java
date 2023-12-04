package com.returntype;

public class Person {
    String name;

    String displayDetails(String name) {
        return name;
    }

    void getName(String name) {
        System.out.println("Your name is: " + name);
    }
}
