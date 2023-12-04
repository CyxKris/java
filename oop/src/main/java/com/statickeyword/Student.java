package com.statickeyword;

public class Student {

    String id = "ID001";
    String name = "Martha Groove";
    String course = "Neuroscience";

    final static String message = "This is the welcome message...";

    void displayDetails() {
        System.out.println("This method displays details...");
        System.out.println("\nID: " + id + "\nNAME: " + name + "\nCOURSE: " + course + "\n");
    }

    static void welcome() {
        System.out.println("This is the welcome method...");
        System.out.println(message + "\n");
    }
}
