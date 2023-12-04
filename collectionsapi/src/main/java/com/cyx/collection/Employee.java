package com.cyx.collection;

public class Employee {


    private String employeeID;
    private String employeeName;
    private String employeeDepartment;

    public Employee(String id, String name, String department) {
        employeeID = id;
        employeeName = name;
        employeeDepartment = department;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeDepartment() {
        return employeeDepartment;
    }

    public void setEmployeeDepartment(String employeeDepartment) {
        this.employeeDepartment = employeeDepartment;
    }


}
