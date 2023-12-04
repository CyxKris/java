package com.cyx.studentdatagui;

import javax.swing.*;

import com.formdev.flatlaf.FlatClientProperties;

import net.miginfocom.swing.MigLayout;
import raven.toast.Notifications;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class RegisterForm extends JPanel {

    public JTextField firstNameField, lastNameField, programField;

    private RegisterForm() {
        init();
    }

    static RegisterForm registerForm;

    public static RegisterForm getInstance() {
        if (registerForm == null) {
            registerForm = new RegisterForm();
        }

        return registerForm;
    }

    public void init() {
        setLayout(new MigLayout("wrap, fillx, insets 20", "fill"));

        JLabel formLabel = new JLabel("Add New Student");
        formLabel.putClientProperty(FlatClientProperties.STYLE, "" +
            "font: bold +5"
        );

        JPanel formPanel, firstNamePanel, lastNamePanel, programPanel, buttonPanel;


        // ?FIRST PANEL----------------------------------------------------------------
        firstNamePanel = new JPanel(new MigLayout());

        JLabel firstNameLabel = new JLabel("First Name");
        firstNameLabel.putClientProperty(FlatClientProperties.STYLE, "" +
                "font: bold +2");

        firstNameField = new JTextField();
        firstNameField.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Enter first Name");
        firstNameField.setColumns(30);

        firstNamePanel.add(firstNameLabel, "wrap");
        firstNamePanel.add(firstNameField);



        // ?LAST PANEL----------------------------------------------------------------
        lastNamePanel = new JPanel(new MigLayout());

        JLabel lastNameLabel = new JLabel("Last Name");
        lastNameLabel.putClientProperty(FlatClientProperties.STYLE, "" +
                "font: bold +2");

        lastNameField = new JTextField();
        lastNameField.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Enter last Name");
        lastNameField.setColumns(30);

        lastNamePanel.add(lastNameLabel, "wrap");
        lastNamePanel.add(lastNameField);



        // ?PROGRAM PANEL-------------------------------------------------------------
        programPanel = new JPanel(new MigLayout());

        JLabel programLabel = new JLabel("Student Program");
        programLabel.putClientProperty(FlatClientProperties.STYLE, "" +
            "font: bold +2"
        );

        programField = new JTextField();
        programField.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Enter student's program");
        programField.setColumns(30);

        programPanel.add(programLabel, "wrap");
        programPanel.add(programField);

        formPanel = new JPanel(new GridLayout(2, 2, 0, 20));
        formPanel.putClientProperty(FlatClientProperties.STYLE, "" +
            "opaque: false"
        );




        // ?BUTTON PANEL--------------------------------------------------------------
        buttonPanel = new JPanel(new MigLayout());

        JButton saveButton, clearButton;

        saveButton = new JButton("Save");
        saveButton.putClientProperty(FlatClientProperties.STYLE, "" +
            "font: bold;"
        );
        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                saveButtonActionPerformed(event);
            }
        });


        clearButton = new JButton("Clear");
        clearButton.putClientProperty(FlatClientProperties.STYLE, "" +
            "font: bold;"
        );
        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                clearButtonActionPerformed(event);
            }
        });

        buttonPanel.add(clearButton);
        buttonPanel.add(saveButton);
        buttonPanel.putClientProperty(FlatClientProperties.STYLE, "" +
            "opaque: false"
        );



        formPanel.add(firstNamePanel);
        formPanel.add(lastNamePanel);
        formPanel.add(programPanel);

        add(formLabel, "gapx 3px, gapy 20px");
        add(formPanel);
        add(buttonPanel, "gapbefore push");
    }

    protected void clearButtonActionPerformed(ActionEvent event) {
        firstNameField.setText("");
        lastNameField.setText("");
        programField.setText("");
    }

    void updateDatabase() {
        try {
            // Getting the driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Getting the connection to the database
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/gui_db", "root", "");

            // The SQL statement to be sent
            String query = "INSERT INTO students(firstName, lastName, program) values(?, ?, ?)";

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            String firstName = firstNameField.getText();
            String lastName = lastNameField.getText();
            String program = programField.getText();

            if ((firstName.isEmpty()) || (lastName.isEmpty()) || (program.isEmpty())) {
                Notifications.getInstance().show(
                    Notifications.Type.ERROR,
                    Notifications.Location.BOTTOM_RIGHT,
                    "Fill all the required fields."
                );
            } else {
                preparedStatement.setString(1, firstName);
                preparedStatement.setString(2, lastName);
                preparedStatement.setString(3, program);

                int i = preparedStatement.executeUpdate();

                if (i >= 1) {
                    Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.BOTTOM_RIGHT,
                            "Data inserted successfully.");
                    
                    firstNameField.setText(null);
                    lastNameField.setText(null);
                    programField.setText(null);
                } else {
                    Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.BOTTOM_RIGHT,
                            "Error experienced while inserting data.");
                }
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    protected void saveButtonActionPerformed(ActionEvent event) {

        updateDatabase();
        // TableView.getInstance().getDatabaseData();
    }
}
