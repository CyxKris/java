package com.cyx.internalization;

// Import statements.  
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class LayoutDemo extends JFrame {

    // Initializing the value of
    // currentCard to 1 .
    private int currentCard = 1;

    // Declaring of objects
    // of the CardLayout class.
    private CardLayout cardLayout;

    // constructor of the class
    public LayoutDemo() {

        // Method to set the Title of the JFrame
        setTitle("Card Layout Methods");

        // Method to set the visibility of the JFrame
        setSize(310, 160);

        // Creating an Object of the "Jpanel" class
        JPanel mainPanel = new JPanel();

        // Initializing of the object "cardLayout"
        // of the CardLayout class.
        cardLayout = new CardLayout();

        // setting the layout
        mainPanel.setLayout(cardLayout);

        // Initializing the object
        // "jPanel1" of the JPanel class.
        JPanel jPanel1 = new JPanel();

        // Initializing the object
        // "jPanel2" of the CardLayout class.
        JPanel jPanel2 = new JPanel();

        // Initializing the object
        // "jPanel3" of the CardLayout class.
        JPanel jPanel3 = new JPanel();

        // Initializing the object
        // "jPanel4" of the CardLayout class.
        JPanel jPanel4 = new JPanel();

        // Initializing the object
        // "jl1" of the JLabel class.
        JLabel jLabel1 = new JLabel("Card One");

        // Initializing the object
        // "jLabel2" of the JLabel class.
        JLabel jLabel2 = new JLabel("Card Two");

        // Initializing the object
        // "jLabel3" of the JLabel class.
        JLabel jLabel3 = new JLabel("Card Three");

        // Initializing the object
        // "jLabel4" of the JLabel class.
        JLabel jLabel4 = new JLabel("Card Four");

        // Adding JLabel "jLabel1" to the JPanel "jPanel1".
        jPanel1.add(jLabel1);

        // Adding JLabel "jLabel2" to the JPanel "jPanel2".
        jPanel2.add(jLabel2);

        // Adding JLabel "jLabel3" to the JPanel "jPanel3".
        jPanel3.add(jLabel3);

        // Adding JLabel "jLabel4" to the JPanel "jPanel4".
        jPanel4.add(jLabel4);

        // Add the "jPanel1" on mainPanel
        mainPanel.add(jPanel1, "1");

        // Add the "jPanel2" on mainPanel
        mainPanel.add(jPanel2, "2");

        // Add the "jPanel3" on mainPanel
        mainPanel.add(jPanel3, "3");

        // Add the "jPanel4" on mainPanel
        mainPanel.add(jPanel4, "4");

        // Creating an Object of the "JPanel" class
        JPanel btnPanel = new JPanel();

        // Initializing the object
        // "firstButton" of the JButton class.
        JButton firstButton = new JButton("First");

        // Initializing the object
        // "nextButton" of the JButton class.
        JButton nextButton = new JButton("->");

        // Initializing the object
        // "previousbtn" of JButton class.
        JButton previousButton = new JButton("<-");

        // Initializing the object
        // "lastButton" of the JButton class.
        JButton lastButton = new JButton("Last");

        // Adding the JButton "firstbutton" on the JPanel.
        btnPanel.add(firstButton);

        // Adding the JButton "nextButton" on the JPanel.
        btnPanel.add(nextButton);

        // Adding the JButton "previousButton" on the JPanel.
        btnPanel.add(previousButton);

        // Adding the JButton "lastButton" on the JPanel.
        btnPanel.add(lastButton);

        // adding firstButton in the ActionListener
        firstButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                // using the first cardLayout CardLayout
                cardLayout.first(mainPanel);

                // value of currentCard is 1
                currentCard = 1;
            }
        });

        // add lastButton in ActionListener
        lastButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                // using the last cardLayout CardLayout
                cardLayout.last(mainPanel);

                // value of currentCard is 4
                currentCard = 4;
            }
        });

        // add nextButton in ActionListener
        nextButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                if (currentCard < 4) {

                    // increase the value of currentCard by 1
                    currentCard = currentCard + 1;

                    // show the value of currentCard
                    cardLayout.show(mainPanel, "" + (currentCard));
                }
            }
        });

        // add previousButton in ActionListener
        previousButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                if (currentCard > 1) {

                    // decrease the value
                    // of currentCard by 1
                    currentCard = currentCard - 1;

                    // show the value of currentCard
                    cardLayout.show(mainPanel, "" + (currentCard));
                }
            }
        });

        // using to get the content pane
        getContentPane().add(mainPanel, BorderLayout.NORTH);

        // using to get the content pane
        getContentPane().add(btnPanel, BorderLayout.SOUTH);
    }

    // main method
    public static void main(String args[]) {

        // Creating an object of the CardLayoutExample3 class.
        LayoutDemo layoutDemo = new LayoutDemo();

        // method to set the default operation of the JFrame.
        layoutDemo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // aethod to set the visibility of the JFrame.
        layoutDemo.setVisible(true);
    }
}
