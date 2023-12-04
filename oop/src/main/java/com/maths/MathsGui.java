package com.maths;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import com.formdev.flatlaf.FlatClientProperties;
import net.miginfocom.swing.MigLayout;


public class MathsGui extends JFrame {
    JTextField number1, number2;

    JTextField maxResult, squareResult, powerResult, randomNumberResult;

    JPanel mainPanel, formPanel, resultPanel;

    JCheckBox squareRootBox, powerBox, maxNumberBox, randomNumberBox;

    JButton applyButton, showResultButton;

    Container mainContainer;
    CardLayout cardLayout;

    public MathsGui() {
        init();
    }

    public void init() {
        setTitle("Maths Application");
        setSize(800, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        mainContainer = new Container();
        cardLayout = new CardLayout();
        mainContainer.setLayout(cardLayout);

        // ?MAIN PANEL OF THE PAGE
        mainPanel = new JPanel(new MigLayout("fill, insets 20", "[center]", "[center]"));

        // ?THE FORM PANEL
        formPanel = new JPanel(new MigLayout("wrap, fillx, insets 30 45", "fill, 500:280"));

        JLabel number1Label, number2Label;

        number1Label = new JLabel("Enter the first number");
        number1Label.putClientProperty(FlatClientProperties.STYLE, "" +
                "font: bold +2");

        number2Label = new JLabel("Enter the second number");
        number2Label.putClientProperty(FlatClientProperties.STYLE, "" +
                "font: bold +2");

        // ?the number fields
        number1 = new JTextField();
        number2 = new JTextField();

        // ?the options panel
        JPanel optionPanel = new JPanel(new MigLayout("insets 0"));
        optionPanel.putClientProperty(FlatClientProperties.STYLE, " " +
                "opaque: false");

        squareRootBox = new JCheckBox("Get square root");
        powerBox = new JCheckBox("Get power");
        maxNumberBox = new JCheckBox("Get max number");
        randomNumberBox = new JCheckBox("Get random number");

        optionPanel.add(squareRootBox);
        optionPanel.add(powerBox);
        optionPanel.add(maxNumberBox);
        optionPanel.add(randomNumberBox);

        // ?the buttons panel
        JPanel buttonPanel = new JPanel(new MigLayout("insets 0"));
        buttonPanel.putClientProperty(FlatClientProperties.STYLE, " " +
                "opaque: false");

        applyButton = new JButton("APPLY");
        applyButton.putClientProperty(FlatClientProperties.STYLE, "" +
                "font: bold;");

        applyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                applyButtonActionPerformed(event);
            }
        });

        showResultButton = new JButton("SHOW RESULT");
        showResultButton.putClientProperty(FlatClientProperties.STYLE, "" +
                "font: bold;");

        showResultButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                showResultButtonActionPerformed(event);
                // nextButtonActionPerformed(event);
            }
        });

        buttonPanel.add(applyButton);
        buttonPanel.add(showResultButton);

        formPanel.add(number1Label);
        formPanel.add(number1);
        formPanel.add(number2Label);
        formPanel.add(number2);
        formPanel.add(optionPanel);
        formPanel.add(buttonPanel, "gapy 20, gapbefore push");

        // ?THE RESULTS PANEL
        JLabel message2, maxResultLabel, squareResultLabel, powerResultLabel, randomNumberResultLabel;

        message2 = new JLabel("Your Results");
        message2.putClientProperty(FlatClientProperties.STYLE, "" +
                "font: bold +15");

        maxResultLabel = new JLabel("The bigger number between x and y is:");
        maxResultLabel.putClientProperty(FlatClientProperties.STYLE, "" +
                "font: bold +2");

        maxResult = new JTextField();
        maxResult.setEditable(false);

        squareResultLabel = new JLabel("The square root of x is: ");
        squareResultLabel.putClientProperty(FlatClientProperties.STYLE, "" +
                "font: bold +2");

        squareResult = new JTextField();
        squareResult.setEditable(false);

        resultPanel = new JPanel();

        resultPanel.add(message2);
        resultPanel.add(maxResultLabel);
        resultPanel.add(maxResult);
        resultPanel.add(new JSeparator());
        resultPanel.add(squareResultLabel);
        resultPanel.add(squareResult);
        resultPanel.add(new JSeparator());

        mainContainer.add(formPanel, "1");
        mainContainer.add(resultPanel, "2");

        mainPanel.add(mainContainer);

        setContentPane(mainPanel);
        setVisible(true);
    }

    private void nextButtonActionPerformed(ActionEvent event) {
        cardLayout.next(mainContainer);
    }

    private void backButtonActionPerformed(ActionEvent event) {
        cardLayout.previous(mainContainer);
    }

    protected void showResultButtonActionPerformed(ActionEvent event) {
        nextButtonActionPerformed(event);
    }

    protected void applyButtonActionPerformed(ActionEvent event) {

    }
}

/*
 * CREATE TABLE photo(
	photo_ID INT AUTO_INCREMENT,
    photo_Name LONGBLOB NOT NULL,
    PRIMARY KEY (photo_ID)
);
 */
