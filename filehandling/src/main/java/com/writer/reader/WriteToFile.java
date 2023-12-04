package com.writer.reader;

// ?IMPORTS
import java.io.FileWriter;

public class WriteToFile {
    String filename;
    String myFile;
    
    void saveData() {
        filename = "new-file.txt";
        myFile = "C:\\Users\\cyxkr\\Documents\\Programming\\Java\\" + filename;
        try {
            String data = "I really love watching the stars";

            FileWriter writer = new FileWriter(myFile);
            writer.write(data);

            writer.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
