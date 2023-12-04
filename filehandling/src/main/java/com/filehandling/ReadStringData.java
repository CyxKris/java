package com.filehandling;

// ?IMPORTS
import java.io.File;
import java.util.Scanner;
import org.apache.commons.io.FileUtils;


public class ReadStringData {

    public static void main(String[] args) {
        ReadStringData readStringData = new ReadStringData();
        readStringData.stringData();
    }

    void stringData() {
        Scanner scanner = new Scanner(System.in);
        try {

            System.out.println("What file do you want to read in the JAVA folder?");
            String filename = scanner.nextLine();
            String myFile = "C:\\Users\\cyxkr\\Documents\\Programming\\Java\\" + filename;

            String fileString = FileUtils.readFileToString(new File(myFile), "UTF-8");
            System.out.println("----------YOUR FILE DATA----------");
            System.out.println(fileString);
            // System.out.println(FileUtils.readFileToString(new File(myFile), "UTF-8"));

        } catch (Exception e) {
            System.out.println(e);
            // What can we say about what to do... we're secretly out of control...
        } finally {
            scanner.close();
        }
    }
}
