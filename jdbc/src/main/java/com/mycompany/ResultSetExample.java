package com.mycompany;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetExample {


    public String displayData() {
        String result = "";

        // *Connecting to the database
        try {
            

            String url = "jdbc:mysql://localhost:3306/gui_db";
            String user = "root";
            String password = "";

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = (Connection) DriverManager.getConnection(url, user, password);

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT * FROM staff_table");


            while (resultSet.next()) {
                int id = resultSet.getInt("staff_ID");
                String name = resultSet.getString("staff_Name");
                String department = resultSet.getString("staff_Department");

                result += "--------------------\nID: " + id + "\nName: " + name + "\nDepartment: " + department + "\n\n";

                // System.out.println("--------------------\nID: " + id + "\nName: " + name + "\nDepartment: " + department + "\n\n");
            }


        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            // System.out.println("Class not found: " + e);
        }

        return result;

    }
    // public static void main(String[] args) {

        
    // }
}
