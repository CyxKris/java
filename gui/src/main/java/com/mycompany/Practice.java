package com.mycompany;

import javax.swing.*;
import java.awt.*;

public class Practice extends JFrame {
    ImageIcon icon = new ImageIcon("images/home-icon.png");
    // Colors
    static int richBlack = 0x050517;
    static int flame = 0xCF5C36;
    static int sunset = 0xEFC88B;
    static int vanilla = 0xF4E3B2;
    static int platinum = 0xD3D5D7;

    private static JPanel mainPanel = new JPanel();

    public Practice() {
        setTitle("A Simple Practice");
        setSize(700, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setIconImage(icon.getImage());
        // getContentPane().setBackground(new Color(flame));
        setVisible(true);
    }

    public static void main(String[] args) {
        Practice practice = new Practice();

        mainPanel.setBackground(new Color(richBlack));
        mainPanel.setFont(new Font("Damn", Font.BOLD, 20));

        JLabel label = new JLabel("This is a practice application");
        label.setFont(new Font("Damn", Font.BOLD, 20));
        label.setForeground(new Color(sunset));
        
        mainPanel.add(label);
        practice.setContentPane(mainPanel);
    }
}
