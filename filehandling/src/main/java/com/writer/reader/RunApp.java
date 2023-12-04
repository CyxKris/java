package com.writer.reader;

import java.util.Scanner;

public class RunApp {
    public static void main(String[] args) {
        // FileHandler fileHandler = new FileHandler();
        // fileHandler.createFile();

        // WriteToFile writeFile = new WriteToFile();
        // writeFile.saveData();


        // ?THE EMPLOYEE ASSIGNMENT
        /*
        Scanner scanner = new Scanner(System.in);
        
        Employee employee = new Employee();
        
        SaveEmployee save = new SaveEmployee();
        
        System.out.println("This program saves employee details to a file!\n");
        // System.out.println(employee.getData());
        
        String fileData = employee.getData();
        
        System.out.println("\n\n-----CREATING FILE-----");
        System.out.println("\nEnter your file name: ");
        String fileName = scanner.nextLine();
        
        save.createFile(fileName, fileData);
        
        scanner.close();
        */
        
        // ?THE FILE-READER CLASS
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your file name: ");
        String filename = scanner.next();

        ReadFromFile readFromFile = new ReadFromFile();
        readFromFile.readFile(filename);

        scanner.close();

    }
}

// ?Create a Employee class. Save the employee details to a file.
