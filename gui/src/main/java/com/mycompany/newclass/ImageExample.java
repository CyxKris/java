package com.mycompany.newclass;

import javax.swing.*;
import java.awt.*;

public class ImageExample extends JFrame {

    public ImageExample() {
        init();
    }

    public void init() {
        setSize(700, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        ImageExample imageExample = new ImageExample();
        imageExample.setLayout(new BorderLayout());
        JPanel mainPanel = new JPanel();

        ImageIcon icon = new ImageIcon("images/save.png");
        JLabel textLabel = new JLabel("Some text");
        textLabel.setIcon(icon);

        mainPanel.add(textLabel, BorderLayout.CENTER);


        imageExample.add(mainPanel);
        imageExample.init();
    }
}
