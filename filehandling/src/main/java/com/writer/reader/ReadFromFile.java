package com.writer.reader;

import java.io.FileReader;
// import org.apache.commons.io.FileUtils;

public class ReadFromFile {

    void readFile(String filename) {
        try {

            String myFile = "C:\\Users\\cyxkr\\Documents\\Programming\\Java\\" + filename;
            FileReader fileReader = new FileReader(myFile);

            int i;
            while ((i = fileReader.read()) != -1) {
                System.out.print((char) i);
            }

            fileReader.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
