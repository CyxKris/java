package com.mycompany;

import javax.swing.*;

import com.formdev.flatlaf.FlatClientProperties;

import net.miginfocom.swing.MigLayout;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NetworkFormGui extends Container {
    CardLayout cardLayout;

    JTextField urlField, urlResultField, portResultField, protocolResultField, hostResultField, hNameResultField, hAddressResultField;
    JCheckBox portCheckBox, protocolCheckBox, hostCheckBox, hostNameCheckBox, hostAddressCheckBox;

    public NetworkFormGui() {
        init();
    }

    public void init() {

        cardLayout = new CardLayout();
        setLayout(cardLayout);



        // ?THE FIRST PANEL
        JPanel firstPanel, optionsPanel, buttonPanel;

        JLabel greeting, message1, urlLabel, optionsLabel;

        greeting = new JLabel("Good day!");
        greeting.putClientProperty(FlatClientProperties.STYLE, "" +
            "font: bold +15"
        );

        message1 = new JLabel("Fill the form below to get URL data.");
        message1.putClientProperty(FlatClientProperties.STYLE, "" +
            "[light]foreground: lighten(@foreground, 30%);" +
            "[dark]foreground: darken(@foreground, 30%);"
        );

        urlLabel = new JLabel("URL:");
        urlLabel.putClientProperty(FlatClientProperties.STYLE, "" +
            "font: bold +2"
        );

        urlField = new JTextField();
        urlField.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT,
            "www.exampleaddress.com"
        );

        optionsLabel = new JLabel("CHOOSE OPTIONS:");
        optionsLabel.putClientProperty(FlatClientProperties.STYLE, "" +
            "font: bold +2"
        );

        optionsPanel = new JPanel(new MigLayout());

        portCheckBox = new JCheckBox("Get Port");
        protocolCheckBox = new JCheckBox("Get Protocol");
        hostCheckBox = new JCheckBox("Get Host");
        hostNameCheckBox = new JCheckBox("Get Host Name");
        hostAddressCheckBox = new JCheckBox("Get Host Address");

        optionsPanel.add(portCheckBox);
        optionsPanel.add(protocolCheckBox);
        optionsPanel.add(hostCheckBox, "wrap");
        optionsPanel.add(hostNameCheckBox);
        optionsPanel.add(hostAddressCheckBox);
        optionsPanel.putClientProperty(FlatClientProperties.STYLE, "" +
            "opaque: false"
        );

        buttonPanel = new JPanel(new MigLayout());

        JButton applyButton, nextButton;

        applyButton = new JButton("APPLY");
        applyButton.putClientProperty(FlatClientProperties.STYLE, "" +
            "font: bold;"
        );

        applyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                applyButtonActionPerformed(event);
            }
        });

        nextButton = new JButton("NEXT");
        nextButton.putClientProperty(FlatClientProperties.STYLE, "" +
            "font: bold;"
        );

        nextButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                nextButtonActionPerformed(event);
            }
        });

        buttonPanel.add(applyButton);
        buttonPanel.add(nextButton);
        buttonPanel.putClientProperty(FlatClientProperties.STYLE, "" +
            "opaque: false"
        );



        firstPanel = new JPanel(new MigLayout("wrap, fillx, insets 30 45", "fill, 500:280"));
        firstPanel.putClientProperty(FlatClientProperties.STYLE, "" +
            "arc: 20;" +
            "background: lighten(#0B253A, 1%);"
        );
        firstPanel.add(greeting);
        firstPanel.add(message1);
        firstPanel.add(urlLabel, "gapy 5");
        firstPanel.add(urlField);
        firstPanel.add(optionsLabel, "gapy 5");
        firstPanel.add(optionsPanel);
        firstPanel.add(buttonPanel, "gapbefore push");




        // ?THE SECOND PANEL
        JPanel secondPanel, resultPanel, portPanel, protocolPanel, hostPanel, hNamePanel, hAddressPanel, buttonPanel2;

        JLabel message, urlResultLabel, portResultLabel, protocolResultLabel, hostResultLabel, hNameResultLabel, hAddressResultLabel;

        message = new JLabel("Your Results");
        message.putClientProperty(FlatClientProperties.STYLE, "" +
            "font: bold +15"
        );

        urlResultLabel = new JLabel("URL:");
        urlResultLabel.putClientProperty(FlatClientProperties.STYLE, "" +
            "font: bold +2"
        );

        urlResultField = new JTextField();
        urlResultField.setEditable(false);

        resultPanel = new JPanel(new GridLayout(2, 3));

        // ?------------------------------------------------

        portPanel = new JPanel(new MigLayout());

        portResultLabel = new JLabel("PORT:");
        portResultLabel.putClientProperty(FlatClientProperties.STYLE, "" +
            "font: bold +2"
        );

        portResultField = new JTextField();
        portResultField.setEditable(false);
        portResultField.setColumns(15);

        portPanel.add(portResultLabel, "wrap");
        portPanel.add(portResultField);
        portPanel.putClientProperty(FlatClientProperties.STYLE, "" +
            "opaque: false"
        );

        // ?------------------------------------------------

        protocolPanel = new JPanel(new MigLayout());

        protocolResultLabel = new JLabel("PROTOCOL:");
        protocolResultLabel.putClientProperty(FlatClientProperties.STYLE, "" +
            "font: bold +2"
        );

        protocolResultField = new JTextField();
        protocolResultField.setEditable(false);
        protocolResultField.setColumns(15);

        protocolPanel.add(protocolResultLabel, "wrap");
        protocolPanel.add(protocolResultField);
        protocolPanel.putClientProperty(FlatClientProperties.STYLE, "" +
            "opaque: false"
        );

        // ?------------------------------------------------

        hostPanel = new JPanel(new MigLayout());

        hostResultLabel = new JLabel("HOST:");
        hostResultLabel.putClientProperty(FlatClientProperties.STYLE, "" +
            "font: bold +2"
        );

        hostResultField = new JTextField();
        hostResultField.setEditable(false);
        hostResultField.setColumns(15);

        hostPanel.add(hostResultLabel, "wrap");
        hostPanel.add(hostResultField);
        hostPanel.putClientProperty(FlatClientProperties.STYLE, "" +
            "opaque: false"
        );

        // ?------------------------------------------------

        hNamePanel = new JPanel(new MigLayout());

        hNameResultLabel = new JLabel("HOST NAME:");
        hNameResultLabel.putClientProperty(FlatClientProperties.STYLE, "" +
            "font: bold +2"
        );

        hNameResultField = new JTextField();
        hNameResultField.setEditable(false);
        hNameResultField.setColumns(15);

        hNamePanel.add(hNameResultLabel, "wrap");
        hNamePanel.add(hNameResultField);
        hNamePanel.putClientProperty(FlatClientProperties.STYLE, "" +
            "opaque: false"
        );

        // ?------------------------------------------------

        hAddressPanel = new JPanel(new MigLayout());

        hAddressResultLabel = new JLabel("HOST ADDRESS:");
        hAddressResultLabel.putClientProperty(FlatClientProperties.STYLE, "" +
            "font: bold +2"
        );

        hAddressResultField = new JTextField();
        hAddressResultField.setEditable(false);
        hAddressResultField.setColumns(15);

        hAddressPanel.add(hAddressResultLabel, "wrap");
        hAddressPanel.add(hAddressResultField);
        hAddressPanel.putClientProperty(FlatClientProperties.STYLE, "" +
            "opaque: false"
        );

        // ?------------------------------------------------

        resultPanel.add(portPanel);
        resultPanel.add(protocolPanel);
        resultPanel.add(hostPanel, "wrap");
        resultPanel.add(hNamePanel);
        resultPanel.add(hAddressPanel);
        resultPanel.putClientProperty(FlatClientProperties.STYLE, "" +
            "opaque: false"
        );



        buttonPanel2 = new JPanel(new MigLayout());

        JButton backButton, saveToDatabaseButton;

        backButton = new JButton("BACK");
        backButton.putClientProperty(FlatClientProperties.STYLE, "" +
            "font: bold;"
        );
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                backButtonActionPerformed(event);
            }
        });

        saveToDatabaseButton = new JButton("SAVE TO DATABASE");
        saveToDatabaseButton.putClientProperty(FlatClientProperties.STYLE, "" +
            "font: bold;"
        );
        saveToDatabaseButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                saveToDatabaseButtonActionPerformed(event);
            }
        });

        buttonPanel2.add(backButton);
        buttonPanel2.add(saveToDatabaseButton);
        buttonPanel2.putClientProperty(FlatClientProperties.STYLE, "" +
            "opaque: false"
        );



        secondPanel = new JPanel(new MigLayout("wrap, fillx, insets 30 45", "fill, 500:280"));
        secondPanel.putClientProperty(FlatClientProperties.STYLE, "" +
            "arc: 20;" +
            "background: lighten(#0B253A, 1%);"
        );
        secondPanel.add(message);
        secondPanel.add(urlResultLabel, "gapy 5");
        secondPanel.add(urlResultField);
        secondPanel.add(resultPanel);
        secondPanel.add(buttonPanel2, "gapbefore push");




        this.add(firstPanel, "1");
        this.add(secondPanel, "2");

    }
    

    private void nextButtonActionPerformed(ActionEvent event) {
        cardLayout.next(this);
    }

    private void backButtonActionPerformed(ActionEvent event) {
        cardLayout.previous(this);
    }

    private void applyButtonActionPerformed(ActionEvent event) {

        String url = urlField.getText();

        if (portCheckBox.isSelected()) {
            int port = NetworkApp.getInstance().getPort(url);
            portResultField.setText(Integer.toString(port));
        } else {
            portResultField.setText("");
        }

        if (protocolCheckBox.isSelected()) {
            String protocol = NetworkApp.getInstance().getProtocol(url);
            protocolResultField.setText(protocol);
        } else {
            protocolResultField.setText("");
        }

        if (hostCheckBox.isSelected()) {
            String host = NetworkApp.getInstance().getHost(url);
            hostResultField.setText(host);
        } else {
            hostResultField.setText("");
        }

        if (hostNameCheckBox.isSelected()) {
            String domain = NetworkApp.getInstance().getDomainName(url);
            hNameResultField.setText(domain);
        } else {
            hNameResultField.setText("");
        }

        if (hostAddressCheckBox.isSelected()) {
            String address = NetworkApp.getInstance().getIpAddress(url);
            hAddressResultField.setText(address);
        } else {
            hAddressResultField.setText("");
        }

        urlResultField.setText(url);

    }
    
    private void saveToDatabaseButtonActionPerformed(ActionEvent event) {
        System.out.println("Saved to database");
    }
}
