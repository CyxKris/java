package com.classdesign.singleton;

public class Employee {

    private Employee() {

    }

    public static Employee getInstance() {
        return new Employee();
    }


    String employeeID;
    String employeeName;
    String employeeMail;

    String getEmployeeDetails(String id, String name, String email) {
        employeeID = id;
        employeeName = name;
        employeeMail = email;
        // System.out.println("Employee ID: " + employeeID + "\nEmployee Name: " + employeeName + "\nEmployee Mail: " + employeeMail);
        return "Employee ID: " + employeeID + "\nEmployee Name: " + employeeName + "\nEmployee Mail: " + employeeMail;
    }
}
