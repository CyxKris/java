package com.classdesign.singleton;

public class App {
    public static void main(String[] args) {
        
        // Student1 studentOne = new Student1();
        // studentOne.displayData();
        // Student1.getInstance().displayData();

        System.out.println(Employee.getInstance().getEmployeeDetails("ID003", "MR. Butler", "maxbutler@gmail.com"));
    }
}
