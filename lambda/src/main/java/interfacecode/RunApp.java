package interfacecode;

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class RunApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // IUnique simpleMessage = ()-> {
        //     System.out.println("This is from a lambda expression...");
        // };

        // simpleMessage.nigeria();

        /* *THE ADDITION INTERFACE
        IAddition add = (a, b) -> {
            int result = a + b;
        
            System.out.println("\nThe result of " + a + " + " + b + " is : " + result);
        };
        
        System.out.println("Enter the first number: ");
        int a = scanner.nextInt();
        
        System.out.println("\nEnter the second number: ");
        int b = scanner.nextInt();
        
        add.add(a, b);
        
        scanner.close();
        */
        
        /*
        IAverage average = (a, b) -> {
            int sum = a + b;
            int result = sum / 2;
        
            System.out.println("\nThe result of the average of " + a + " and " + b + " is : " + result);
        };
        
        System.out.println("Enter the first number: ");
        int a = scanner.nextInt();
        
        System.out.println("\nEnter the second number: ");
        int b = scanner.nextInt();
        
        average.calculateAverage(a, b);
        scanner.close();
        */


        
        /*
        ITask task = (a, b, c) -> {
            int result = a * b * c;
        
            String message = "\nThe result of mulitplying " + a + ", " + b + " and " + c + " is : " + result;
            System.out.println(message);
        
            return message;
        };
        
        System.out.println("Enter the first number: ");
        int a = scanner.nextInt();
        
        System.out.println("\nEnter the second number: ");
        int b = scanner.nextInt();
        
        System.out.println("\nEnter the third number: ");
        int c = scanner.nextInt();
        
        task.multiply(a, b, c);
        
        */
        

        /*
        SaySomething saySomething = (name) -> {
            String message = "\nYour name is " + name;
        
            System.out.println(message);
        
            return message;
        };
        
        System.out.println("Enter your name: ");
        String name = scanner.next();
        
        saySomething.say(name);
        */
        

        IStudent student = (data, filename) -> {
            String filePath = "C:\\Users\\cyxkr\\Documents\\Programming\\Java\\" + filename;

            File file = new File(filePath);
            FileWriter fileWriter = null;
            BufferedWriter bufferedWriter = null;

            try {

                if (file.exists()) {
                    System.out.println("This file already exists!");
                    System.out.println("Adding new data to the file...");

                    fileWriter = new FileWriter(filePath, true);

                    bufferedWriter = new BufferedWriter(fileWriter);
                    bufferedWriter.write(data);
                    // bufferWriter.newLine();

                    bufferedWriter.close();
                    fileWriter.close();

                    System.out.println("DONE!");
                } else if (!file.exists()) {
                    System.out.println("Creating new file...");
                    file.createNewFile();

                    fileWriter = new FileWriter(filePath);
                    fileWriter.write(data);

                    fileWriter.close();
                    System.out.println("DONE!");
                } else {
                    System.out.println("An error occurred while creating the file!");
                }


            } catch (Exception e) {
                System.out.println(e);
            }
        };

        System.out.println("Enter your Student ID: ");
        String id = scanner.nextLine();

        System.out.println("\nEnter your name: ");
        String name = scanner.nextLine();

        System.out.println("\nEnter your course: ");
        String course = scanner.nextLine();

        System.out.println("\nEnter your email: ");
        String email = scanner.nextLine();

        System.out.println("What is the name of your file? ");
        String filename = scanner.nextLine();

        String data = "\nID: " + id + "\nNAME: " + name + "\nCOURSE: " + course + "\nEMAIL: " + email + "\n";

        student.saveData(data, filename);
        scanner.close();
    }
}
