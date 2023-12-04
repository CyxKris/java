package com.returntype;

// IMPORTS
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Customer customer = new Customer();
        // System.out.println("--------------------------------");
        // System.out.println(customer.blueprintObj());

        Scanner scanner = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.println("Input employee name: ");
        String name = scanner.next();
        System.out.println("Input employee id: ");
        String id = scanner.next();
        System.out.println("Input employee age: ");
        int age = scanner.nextInt();
        System.out.println("Input employee department: ");
        String department = scanner.next();
        System.out.println("Input employee salary: ");
        String salary = scanner.next();

        System.out.println(employee.displayDetails(name, id, age, department, salary));

        scanner.close();
    }
}
// ?ASSIGNMENT
// Create an Employee class. Let the class implement method overloading, method overriding and return type....void, int, String, object... Make use of access specifiers too, if you can.