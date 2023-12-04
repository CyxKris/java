package com.writer.reader;

// ?IMPORTS
import java.io.File;

public class FileHandler {
    public String fileName;
    public String myFile;

    public void createFile() {
        fileName = "new-file.txt";
        myFile = "C:\\Users\\cyxkr\\Documents\\Programming\\Java\\" + fileName;
        try {
            File file = new File(myFile);

            // *Perhaps, a conditional statement to check if a file exists already and display the appropriate information.

            if (file.createNewFile()) {
                System.out.println("File created successfully!");
            } else {
                System.out.println("An error occurred...the file might exist already.");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
