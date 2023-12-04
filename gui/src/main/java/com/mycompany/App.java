package com.mycompany;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class App extends JFrame {
    private static JLabel simpleLabel = new JLabel("Student Login Portal");
    private static JLabel usernameLabel = new JLabel("Username");
    private static JTextField usernameBox = new JTextField(25);
    private static JLabel passwordLabel = new JLabel("Password");
    private static JTextField passwordBox = new JTextField(25);

    private static JButton saveButton = new JButton("Save");
    private static JButton loginButton = new JButton("Login");

    public App () {
        setTitle("Aptech Computer Education");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        App app = new App();

        app.setLayout(new FlowLayout());
        app.getContentPane().add(simpleLabel);
        app.getContentPane().add(usernameLabel);
        app.getContentPane().add(usernameBox);
        app.getContentPane().add(passwordLabel);
        app.getContentPane().add(passwordBox);
        app.getContentPane().add(saveButton);
        app.getContentPane().add(loginButton);

        // ?EVENT LISTENERS
        usernameBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

/*  
 * import the necessary classes for database connection
 * after the constructor, add the save to database method
 */
