package com.mycompany.constructorexample;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {

        // String id;
        // String name;
        // String gender;
        // String email;
        // String department;
        // String address;

        String id;
        String name;
        String department;
        String email;
        String phone;
        String state;

        // Initializing the scanner object
        Scanner scanner = new Scanner(System.in);

        // *THE STUDENT CLASS
        // System.out.println("Enter your ID:");
        // id = scanner.next();

        // System.out.println("Enter your Name:");
        // name = scanner.next();

        // System.out.println("Enter your Gender:");
        // gender = scanner.next();

        // System.out.println("Enter your Email:");
        // email = scanner.next();

        // System.out.println("Enter your Department:");
        // department = scanner.next();

        // System.out.println("Enter your Address:");
        // address = scanner.next();
        
        // Student student = new Student(id, name, gender, department, email, address);
        // student.displayInfo();

        // *THE EMPLOYEE CLASS

        System.out.println("Enter your ID:");
        id = scanner.next();

        System.out.println("Enter your Name:");
        name = scanner.next();

        System.out.println("Enter your Department:");
        department = scanner.next();

        System.out.println("Enter your Email:");
        email = scanner.next();

        System.out.println("Enter your Phone Number:");
        phone = scanner.next();

        System.out.println("Enter your State:");
        state = scanner.next();

        Employee employee = new Employee(id, name, department, email, phone, state);
        employee.displayData();

        // closing the scanner
        scanner.close();
    }
}
