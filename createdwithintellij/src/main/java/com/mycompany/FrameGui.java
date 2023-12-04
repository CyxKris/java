package com.mycompany;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class FrameGui extends JFrame {

    private JPanel loginForm;
    private JLabel jlLoginLabel;
    private JLabel jsUsername;
    private JTextField jtUsername;
    private JLabel jsPassword;
    private JTextField jtPassword;
    private JButton saveButton;
    private JButton loginButton;

    String usernameValue;
    String passwordValue;

    void saveLoginDetails(String username, String password) {

        try {

            // Getting the driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Getting the connection to the database
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/gui_db", "root", "");

            // The SQL statement to be sent
            String query = "INSERT INTO gui_table(username, password) values(?, ?)";

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            usernameValue = username;
            passwordValue = password;

            preparedStatement.setString(1, usernameValue);
            preparedStatement.setString(2, passwordValue);

            int i = preparedStatement.executeUpdate();
//            System.out.println("\nThe value of i: " + i + "\n");

            if (i >= 1) {
                System.out.println("Data inserted successfully");
            } else {
                System.out.println("Error experienced while inserting data...");
            }


        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public FrameGui() {
        setTitle("Login Portal");
        setContentPane(loginForm);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(loginButton, "Welcome, " + jtUsername.getText() + " you have logged in succesfully!");
                jtUsername.setText("");
                jtPassword.setText("");
            }
        });
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveLoginDetails(jtUsername.getText(), jtPassword.getText());
            }
        });
    }


    public static void main(String[] args) {
        new FrameGui();
    }
}
