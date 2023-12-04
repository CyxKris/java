package com.mycompany;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SimpleFrame extends JFrame implements ActionListener {
    // *ICONS
    private static ImageIcon saveIcon = new ImageIcon("images/save.png");
    private static ImageIcon frameIcon = new ImageIcon("images/home-icon.png");
    // *PANELS
    private static JPanel mainPanel = new JPanel();
    // *BUTTONS
    private static JButton saveButton = new JButton("Save");

    public SimpleFrame() {
        setTitle("Simple Frame");
        setIconImage(frameIcon.getImage());

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 500);
        setVisible(true);
    }
    
    public static void main(String[] args) {

        SimpleFrame frame = new SimpleFrame();
        
        JLabel titleLabel = new JLabel("Click the button below to do something...");
        titleLabel.setVerticalAlignment(JLabel.TOP);
        titleLabel.setHorizontalAlignment(JLabel.CENTER);

        saveButton.setIcon(saveIcon);
        saveButton.setFocusable(false);
        saveButton.addActionListener(frame);

        mainPanel.setLayout(new GridLayout(5, 2));
        mainPanel.add(titleLabel);
        mainPanel.add(saveButton);

        frame.setContentPane(mainPanel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // if the action performed is on the save button
        if (e.getSource() == saveButton) {
            System.out.println("Save button clicked!");
        }
    }
}
