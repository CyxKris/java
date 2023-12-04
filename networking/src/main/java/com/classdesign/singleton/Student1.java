package com.classdesign.singleton;

public class Student1 {

    String studentID = "ID2009";
    String studentName = "Elizabeth Blackburn";


    private Student1() {

    }

    public static Student1 getInstance() {
        // Student1 student1 = new Student1();
        // return student1;
        return new Student1();
    }

    void displayData() {
        System.out.println("Student ID: " + studentID + "\nStudent Name: " + studentName);
    }


}
