package com.mycompany.constructorexample;

public class Student {
    String id;
    String name;
    String gender;
    String email;
    String department;
    String address;

    Student() {

    }

    Student(String id) {
        this.id = id;
    }

    Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    Student(String id, String name, String gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    Student(String id, String name, String gender, String email) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.email = email;
    }

    Student(String id, String name, String gender, String email, String department) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.department = department;
    }
    
    Student(String id, String name, String gender, String email, String department, String address) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.department = department;
        this.address = address;
    }

    void displayInfo() {
        System.out.println(id + " " + name + " " + gender + " " + email + " " + department + " " + address);
    }
}
