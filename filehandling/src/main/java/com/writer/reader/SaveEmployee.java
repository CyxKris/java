package com.writer.reader;

import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class SaveEmployee {

    String myFile;

    void createFile(String filename, String data) {
        myFile = "C:\\Users\\cyxkr\\Documents\\Programming\\Java\\" + filename;

        try {

            File file = new File(myFile);

            FileWriter writer = null;
            BufferedWriter bufferWriter = null;

            
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

        // } finally {
        //     try {
        //         printWriter.close();
        //         bufferWriter.close();
        //         writer.close();
        //     } catch (IOException e) {
        //         e.printStackTrace();
        //     }
        // }
    };
}
