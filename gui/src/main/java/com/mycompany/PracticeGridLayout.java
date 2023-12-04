package com.mycompany;

import javax.swing.*;
import java.awt.*;

public class PracticeGridLayout extends JFrame {
    ImageIcon icon = new ImageIcon("images/home-icon.png");
    private static JPanel mainPanel = new JPanel();
    static int richBlack = 0x050517;
    
    public PracticeGridLayout() {
        setTitle("Practice Grid Layout");
        setSize(700, 500);
        setIconImage(icon.getImage());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        PracticeGridLayout practiceGridLayout = new PracticeGridLayout();
        practiceGridLayout.setContentPane(mainPanel);

        mainPanel.setLayout(new GridLayout());
        mainPanel.setBackground(new Color(richBlack));
    }
}
