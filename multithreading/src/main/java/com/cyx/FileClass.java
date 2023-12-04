package com.cyx;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import org.apache.commons.io.FileUtils;

public class FileClass {

    private String myFile = "C:/Users/cyxkr/Documents/Programming/Java/threads-file.txt";
    File file = new File(myFile);
    Scanner scanner = null;
    BufferedWriter bufferedWriter = null;
    Object lock;

    public FileClass() {
        lock = new Object();
        try {
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("FILE CREATED SUCCESSFULLY");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public synchronized void ReadFromFile() {
        try {
            System.out.println("\n\nREADING FROM FILE\n");
            String fileData = FileUtils.readFileToString(file, "UTF-8");
            System.out.println("----------YOUR FILE DATA----------\n");
            System.out.println(fileData);
            System.out.println("\n----------END OF FILE----------");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public synchronized void WriteToFile() {
        try {
            if (file.exists()) {
                System.out.println("\n\nWRITING TO FILE\n");
                FileWriter fileWriter = new FileWriter(file, true);
                scanner = new Scanner(System.in);

                System.out.println("What is your name: ");
                String name = scanner.next();

                System.out.println("What is your course: ");
                String course = scanner.next();

                String data = "----------PERSON----------\nNAME: " + name + "\nCOURSE: " + course + "\n\n";

                bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.write(data);

                bufferedWriter.close();
                fileWriter.close();
                scanner.close();

                System.out.println("\nFILE UPDATED SUCCESSFULLY");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}


// ?OR

// public void WriteToFile() {
//     synchronized (lock) {

//         try {
//             if (file.exists()) {
//                 System.out.println("WRITING TO FILE\n");
//                 FileWriter fileWriter = new FileWriter(file, true);
//                 scanner = new Scanner(System.in);

//                 System.out.println("What is your name: ");
//                 String name = scanner.next();

//                 System.out.println("What is your course: ");
//                 String course = scanner.next();

//                 String data = "----------PERSON----------\nNAME: " + name + "\nCOURSE: " + course + "\n\n";

//                 bufferedWriter = new BufferedWriter(fileWriter);
//                 bufferedWriter.write(data);

//                 bufferedWriter.close();
//                 fileWriter.close();
//                 scanner.close();

//                 System.out.println("\nFILE UPDATED SUCCESSFULLY");
//             }
//         } catch (Exception e) {
//             e.printStackTrace();
//         }

//     }
// }



// public void ReadFromFile() {
//     synchronized (lock) {

//         try {
//             System.out.println("READING FROM FILE\n");
//             String fileData = FileUtils.readFileToString(file, "UTF-8");
//             System.out.println("----------YOUR FILE DATA----------\n");
//             System.out.println(fileData);
//             System.out.println("\n----------END OF FILE----------");
//         } catch (Exception e) {
//             e.printStackTrace();
//         }
//     }

// }