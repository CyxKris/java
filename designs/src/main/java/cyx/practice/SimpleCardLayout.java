package cyx.practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCardLayout extends JFrame {
    // private int currentCard = 1;

    CardLayout cardLayout;

    JPanel firstPanel, secondPanel, thirdPanel;

    JLabel message1, message2, message3;

    Container container;

    public SimpleCardLayout() {
        container = getContentPane();

        cardLayout = new CardLayout();

        container.setLayout(cardLayout);

        JButton nextButton = new JButton("Next");
        JButton nextButton1 = new JButton("Next");
        JButton backButton = new JButton("Back");
        JButton backButton1 = new JButton("Back");

        nextButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                nextButtonActionPerformed(event);
            }
        });

        nextButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                nextButtonActionPerformed(event);
            }
        });

        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                backButtonActionPerformed(event);
            }
        });

        backButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                backButtonActionPerformed(event);
            }
        });

        // nextButton.addActionListener(this);
        // backButton.addActionListener(this);

        message1 = new JLabel("This is the first panel!");
        message2 = new JLabel("This is the second panel!");
        message3 = new JLabel("This is the third panel!");

        JTextField name = new JTextField();
        name.setSize(200, 20);

        firstPanel = new JPanel();
        firstPanel.setLayout(new GridLayout(5, 1));
        firstPanel.add(message1);
        firstPanel.add(name);
        firstPanel.add(nextButton);

        secondPanel = new JPanel();
        secondPanel.add(message2);
        secondPanel.add(backButton);
        secondPanel.add(nextButton1);

        thirdPanel = new JPanel();
        thirdPanel.add(message3);
        thirdPanel.add(backButton1);

        container.add(firstPanel, "1");
        container.add(secondPanel, "2");
        container.add(thirdPanel, "3");

    }
    
    private void nextButtonActionPerformed(ActionEvent event) {
        cardLayout.next(container);
        // if (currentCard < 3) {
        //     currentCard += 1;

        //     cardLayout.show(container, "" + (currentCard));
        // }
    }

    private void backButtonActionPerformed(ActionEvent event) {
        cardLayout.previous(container);
        // if (currentCard > 1) {
        //     currentCard -= 1;

        //     cardLayout.show(container, "" + (currentCard));
        // }
    }

    public static void main(String[] args) {
        SimpleCardLayout layout = new SimpleCardLayout();

        layout.setSize(700, 400);
        layout.setVisible(true);
        layout.setLocationRelativeTo(null);
        layout.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
