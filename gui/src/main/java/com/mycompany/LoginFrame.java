package com.mycompany;

import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

/*
 * COLORS
 * Rich-Black: 0x050517
 * Flame: 0xCF5C36
 * Sunset: 0x3FC88B
 * Vanilla: 0xF4E3B2
 * Platinum: 0xD3D5D7
 */

public class LoginFrame extends JFrame {
    
    ImageIcon icon = new ImageIcon("images/home-icon.png");
    // Colors
    int richBlack = 0x050517;
    int flame = 0xCF5C36;
    int sunset = 0xEFC88B;
    int vanilla = 0xF4E3B2;
    int platinum = 0xD3D5D7;

    public LoginFrame() {
        setTitle("Login");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setIconImage(icon.getImage());
        getContentPane().setBackground(new Color(richBlack));
        setVisible(true);
    }
    
    public static void main(String[] args) {
        LoginFrame loginFrame = new LoginFrame();

        JLabel titleLabel = new JLabel("Student Login");
        titleLabel.setVerticalAlignment(JLabel.TOP);
        titleLabel.setHorizontalAlignment(JLabel.CENTER);
        titleLabel.setForeground(new Color(loginFrame.sunset));
        titleLabel.setFont(new Font("Poppins", Font.BOLD, 20));

        loginFrame.add(titleLabel);
    }
}
