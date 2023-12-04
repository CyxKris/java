package com.mycompany;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import java.util.Scanner;

public class Login {

    String usernameValue;
    String passwordValue;

    Scanner scanner = new Scanner(System.in);

    void saveLoginDetails() {

        try {

            // Getting the driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Getting the connection to the database
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/logindb", "root", "");

            // The SQL statement to be sent
            String query = "INSERT INTO login_table(username, password) values(?, ?)";

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            System.out.println("\nEnter your username: ");
            usernameValue = scanner.next();

            System.out.println("\nEnter your password: ");
            passwordValue = scanner.next();

            preparedStatement.setString(1, usernameValue);
            preparedStatement.setString(2, passwordValue);

            int i = preparedStatement.executeUpdate();
            System.out.println("\nThe value of i: " + i + "\n");

            if (i >= 1) {
                System.out.println("Data inserted successfully");
            } else {
                System.out.println("Error experienced while inserting data...");
            }

            scanner.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
