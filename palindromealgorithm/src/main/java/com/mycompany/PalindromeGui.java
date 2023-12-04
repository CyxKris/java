package com.mycompany;

import javax.swing.*;
import java.awt.*;

public class PalindromeGui extends JFrame {
    ImageIcon icon = new ImageIcon("images/notepad.png");
    private static JPanel mainPanel = new JPanel();
    static int black = 0x232C33;
    static int red = 0xE94F37;

    PalindromeGui() {
        setTitle("Palindrome Checker");
        setIconImage(icon.getImage());
        setSize(600, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        PalindromeGui palindromeGui = new PalindromeGui();

        mainPanel.setBackground(new Color(black));
        mainPanel.setFont(new Font("Damn", Font.BOLD, 20));

        JLabel label = new JLabel("Palindrome Checker");
        label.setFont(new Font("Damn", Font.BOLD, 20));
        label.setForeground(new Color(red));

        mainPanel.add(label);

        palindromeGui.setContentPane(mainPanel);
    }
}
