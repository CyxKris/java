// Create an Employee class. Let the class implement method overloading, method overriding and return type....void, int, String, object... Make use of access specifiers too, if you can.
package com.returntype;

public class Employee extends Person {
    String id;
    int age;
    String department;
    String salary;

    void getName(String name) {
        System.out.println("This is the new method and the name is: " + name);
    }

    int getAge(int age) {
        return age;
    }

    public Employee getEmployee() {
        return this;
    }

    // private void getEmployeeById(int id) {
    //     System.out.println("\nThe employee id is " + id);
    // }

    String displayDetails(String name, String id) {
        String details = "\nNAME: " + name + "\nID: " + id;
        System.out.println("---------------------EMPLOYEE DETAILS---------------------");
        return details;
    }

    String displayDetails(String name, String id, int age) {
        String details = "\nNAME: " + name + "\nID: " + id + "\nAGE: " + Integer.toString(age);
        System.out.println("---------------------EMPLOYEE DETAILS---------------------");
        return details;
    }

    String displayDetails(String name, String id, int age, String department) {
        String details = "\nNAME: " + name + "\nID: " + id + "\nAGE: " + Integer.toString(age) + "\nDEPARTMENT: " + department;
        System.out.println("---------------------EMPLOYEE DETAILS---------------------");
        return details;
    }

    String displayDetails(String name, String id, int age, String department, String salary) {
        String details = "\nNAME: " + name + "\nID: " + id + "\nAGE: " + Integer.toString(age) + "\nDEPARTMENT: "
                + department + "\nSALARY: " + salary;
        System.out.println("---------------------EMPLOYEE DETAILS---------------------");
        return details;
    }
}
