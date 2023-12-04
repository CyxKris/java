package com.mycompany.newclass;

import javax.swing.*;
import java.awt.*;
import javax.swing.ImageIcon;

public class ImageExample2 extends JFrame {
    public ImageExample2() {
        init();
    }

    public void init() {
        setSize(700, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        ImageExample2 imageExample2 = new ImageExample2();
        imageExample2.setLayout(new BorderLayout());
        JPanel mainPanel = new JPanel();

        ImageIcon icon = new ImageIcon("images/save.png");
        JLabel textLabel = new JLabel("A simple text");
        textLabel.setHorizontalAlignment(SwingConstants.CENTER);
        textLabel.setIcon(icon);

        // mainPanel.add(textLabel, BorderLayout.CENTER);
        mainPanel.add(textLabel);


        imageExample2.add(mainPanel);
        imageExample2.init();
    }
}
