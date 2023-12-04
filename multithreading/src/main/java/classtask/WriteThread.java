package classtask;

import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteThread extends Thread {
    String name;
    String course;
    String filename;
    Scanner scanner = new Scanner(System.in);

    public void run() {
        filename = "people.txt";
        String myFile = "C:\\Users\\cyxkr\\Documents\\Programming\\Java\\" + filename;

        try {

            File file = new File(myFile);

            FileWriter writer = null;
            BufferedWriter bufferWriter = null;

            System.out.println("----------THE FILE WRITER APPLICATION----------");
            System.out.println("Enter your name: ");
            name = scanner.next();
            System.out.println("Enter your course: ");
            course = scanner.next();

            String data = "----------PERSON----------\nNAME: " + name + "\nCOURSE: " + course + "\n\n";

            
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("File created successfully!");

                writer = new FileWriter(myFile);
                writer.write(data);

                writer.close();

            } else if (file.exists()) {
                System.out.println("This file already exists!");
                System.out.println("Writing to file...");

                writer = new FileWriter(myFile, true);

                bufferWriter = new BufferedWriter(writer);
                bufferWriter.write(data);
                // bufferWriter.newLine();

                bufferWriter.close();
                writer.close();

                System.out.println("DONE!");
            } else {
                System.out.println("An error occurred while creating the file!");
            }

        } catch (IOException e) {
            // System.out.println(e);
            // e.printStackTrace();
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
