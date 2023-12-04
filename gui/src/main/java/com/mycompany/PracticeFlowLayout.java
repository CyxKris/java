package com.mycompany;

import javax.swing.*;
import java.awt.*;

public class PracticeFlowLayout extends JFrame {
    ImageIcon icon = new ImageIcon("images/home-icon.png");
    private static JPanel mainPanel = new JPanel();
    static int richBlack = 0x050517;
    
    // ? CONSTRUCTOR================================
    public PracticeFlowLayout() {
        setTitle("A FlowLayout Practice");
        setSize(800, 600);
        setIconImage(icon.getImage());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        PracticeFlowLayout practiceFlowLayout = new PracticeFlowLayout();
        practiceFlowLayout.setContentPane(mainPanel);

        mainPanel.setLayout(new FlowLayout(FlowLayout.LEADING, 5, 5));
        mainPanel.setBackground(new Color(richBlack));
        mainPanel.add(new JButton("1"));
        mainPanel.add(new JButton("2"));
        mainPanel.add(new JButton("3"));
        mainPanel.add(new JButton("4"));
        mainPanel.add(new JButton("5"));
        mainPanel.add(new JButton("6"));
        mainPanel.add(new JButton("7"));
        mainPanel.add(new JButton("8"));
        mainPanel.add(new JButton("9"));
        mainPanel.add(new JButton("10"));
    }
}
