package com.writer.reader;
import java.util.Scanner;

public class Employee {
    String id;
    String name;
    String email;
    String department;

    public String getData() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your employee ID: ");
        id = scanner.nextLine();

        System.out.println("\nEnter your name: ");
        name = scanner.nextLine();
        // scanner.nextLine();

        System.out.println("\nEnter your email: ");
        email = scanner.nextLine();
        // scanner.nextLine();

        System.out.println("\nEnter your department: ");
        department = scanner.nextLine();

        // scanner.close();
        String employee = "\n----------EMPLOYEE----------\nID: " + id + "\nNAME: " + name + "\nEMAIL: " + email + "\nDEPARTMENT: " + department + "\n";


        return employee;
    }
}
