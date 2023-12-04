package com.mycompany.cryptoapplication;

import com.formdev.flatlaf.FlatClientProperties;
import net.miginfocom.swing.MigLayout;

import com.mycompany.process.AdvancedEncryptionStandard;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.File;
import java.io.FileWriter;

import org.apache.commons.io.FileUtils;
import raven.toast.Notifications;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class NewEncryptForm extends Container {
    CardLayout cardLayout;

    JTextArea dataToEncrypt, encryptionDataResult;
    JTextField encryptionKey, encryptionKeyResult;
    JComboBox<String> messageAlgorithmsCombo, appProcessCombo;
    JCheckBox saveToDatabaseCheckbox, saveToFileCheckbox;

    JFileChooser fileChooser;

    public NewEncryptForm() {
        init();
    }

    public void init() {

        cardLayout = new CardLayout();
        setLayout(cardLayout);

        // ?THE FORM CONTROL BUTTONS
        JButton nextButton = new JButton("Next");
        nextButton.putClientProperty(FlatClientProperties.STYLE, "" +
                "font: bold;");

        JButton nextButton1 = new JButton("Next");
        nextButton1.putClientProperty(FlatClientProperties.STYLE, "" +
                "font: bold;");

        JButton backButton = new JButton("Back");
        backButton.putClientProperty(FlatClientProperties.STYLE, "" +
                "font: bold;");

        JButton backButton1 = new JButton("Back");
        backButton1.putClientProperty(FlatClientProperties.STYLE, "" +
                "font: bold;");

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





        // ?panel 1 members
        JLabel heading, dataToEncryptLabel, dataToEncryptDescription, orLabel, encryptionKeyLabel, message1;

        heading = new JLabel("Hello, there!");
        heading.putClientProperty(FlatClientProperties.STYLE, "" +
            "font: bold +15"
        );

        message1 = new JLabel("Fill the form below to encrypt or decrypt your data.");
        message1.putClientProperty(FlatClientProperties.STYLE, "" +
            "[light]foreground:lighten(@foreground, 30%);" +
            "[dark]foreground:darken(@foreground, 30%);"
        );

        dataToEncryptLabel = new JLabel("Data to encrypt / decrypt");
        dataToEncryptLabel.putClientProperty(FlatClientProperties.STYLE, "" +
            "font: bold +2"
        );

        dataToEncryptDescription = new JLabel("Enter your data below");
        dataToEncryptDescription.putClientProperty(FlatClientProperties.STYLE, "" +
            "[light]foreground:lighten(@foreground, 35%);" +
            "[dark]foreground:darken(@foreground, 35%);"
        );

        dataToEncrypt = new JTextArea();
        dataToEncrypt.setRows(5);
        dataToEncrypt.setLineWrap(true);

        JScrollPane scrollPane = new JScrollPane(
            dataToEncrypt,
            JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
            JScrollPane.HORIZONTAL_SCROLLBAR_NEVER
        );
        // scrollPane.putClientProperty(FlatClientProperties.STYLE, "" +
        //     "arc: 8;"
        // );

        orLabel = new JLabel("OR");
        orLabel.putClientProperty(FlatClientProperties.STYLE, "" +
            "font: bold +1"
        );

        JButton chooseFileButton = new JButton("Choose File");
        chooseFileButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                chooseFileButtonActionPerformed(event);
            }
        });

        encryptionKeyLabel = new JLabel("Encryption / Decryption Key");
        encryptionKeyLabel.putClientProperty(FlatClientProperties.STYLE, "" +
            "font: bold +2"
        );

        encryptionKey = new JTextField();
        encryptionKey.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT,
                "Enter your encryption / decryption key");

        JPanel firstPanel;

        firstPanel = new JPanel(new MigLayout("wrap, fillx, insets 30 45", "fill, 500:280"));
        firstPanel.putClientProperty(FlatClientProperties.STYLE,
            "" +
            "arc: 20;" +
            "background:lighten(#2C2C3B, 3%);"
        );
        firstPanel.add(heading);
        firstPanel.add(message1);
        firstPanel.add(dataToEncryptLabel, "gapy 5");
        firstPanel.add(dataToEncryptDescription);
        firstPanel.add(scrollPane);
        firstPanel.add(orLabel, "gapy 2");
        firstPanel.add(chooseFileButton, "gapy 2");
        firstPanel.add(encryptionKeyLabel, "gapy 5");
        firstPanel.add(encryptionKey);
        firstPanel.add(nextButton, "gapbefore push");





        // ?panel 2 members
        // JLabel message2, encryptionAlgorithmLabel, saveConfigurationLabel, processModeLabel;
        // JPanel buttonPanel, saveConfigurationPanel, processPanel;
        JLabel message2, encryptionAlgorithmLabel, processModeLabel;
        JPanel buttonPanel, processPanel;

        message2 = new JLabel("Configure the process");
        message2.putClientProperty(FlatClientProperties.STYLE, "" +
            "font: bold +10"
        );

        encryptionAlgorithmLabel = new JLabel("Encryption Algorithm");
        encryptionAlgorithmLabel.putClientProperty(FlatClientProperties.STYLE, "" +
            "font: bold +2"
        );

        String[] messageAlgorithms = { "MD2", "MD5", "SHA-1", "SHA-224", "SHA-256", "SHA-384", "SHA-512/224", "SHA-512/256", "SHA3-224", "SHA3-256", "SHA3-384", "SHA3-512" };
        
        messageAlgorithmsCombo = new JComboBox<>(messageAlgorithms);
        messageAlgorithmsCombo.setSelectedIndex(4);


        processModeLabel = new JLabel("Choose Process");
        processModeLabel.putClientProperty(FlatClientProperties.STYLE, "" +
            "font: bold +2"
        );

        String[] appProcess = { "Encrypt", "Decrypt" };

        appProcessCombo = new JComboBox<>(appProcess);
        appProcessCombo.setSelectedIndex(0);

        JButton applyButton = new JButton("Apply");
        applyButton.putClientProperty(FlatClientProperties.STYLE, "" +
            "font: bold;"
        );

        applyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                applyButtonActionPerformed(event);
            }
        });

        processPanel = new JPanel(new MigLayout());
        processPanel.add(appProcessCombo);
        processPanel.add(applyButton);
        processPanel.putClientProperty(FlatClientProperties.STYLE, "" +
            "opaque: false"
        );


        buttonPanel = new JPanel(new MigLayout());
        buttonPanel.add(backButton);
        buttonPanel.add(nextButton1);
        buttonPanel.putClientProperty(FlatClientProperties.STYLE, "" +
            "opaque: false"
        );

        JPanel secondPanel;
        secondPanel = new JPanel(new MigLayout("wrap, fillx, insets 30 45", "fill, 500:280"));
        secondPanel.putClientProperty(FlatClientProperties.STYLE,
            "" +
            "arc: 20;" +
            "background:lighten(#2C2C3B, 3%);"
        );
        secondPanel.add(message2);
        secondPanel.add(encryptionAlgorithmLabel, "gapy 5");
        secondPanel.add(messageAlgorithmsCombo, "gapafter push");
        // secondPanel.add(saveConfigurationLabel, "gaptop 5");
        // secondPanel.add(saveConfigurationPanel);
        secondPanel.add(processModeLabel, "gaptop 5");
        secondPanel.add(processPanel, "gapafter push");
        secondPanel.add(buttonPanel, "gapbefore push");





        // ?panel 3 members
        JLabel message3, encryptionKeyResultLabel, encryptionDataResultLabel;
        JPanel saveOptions, thirdPanel;

        message3 = new JLabel("Your Results");
        message3.putClientProperty(FlatClientProperties.STYLE, "" +
            "font: bold +10"
        );

        encryptionKeyResultLabel = new JLabel("Encryption / Decryption Key");
        encryptionKeyResultLabel.putClientProperty(FlatClientProperties.STYLE, "" +
            "font: bold +2"
        );

        encryptionKeyResult = new JTextField();
        encryptionKeyResult.setEditable(false);

        encryptionDataResultLabel = new JLabel("Encryption / Decryption Data");
        encryptionDataResultLabel.putClientProperty(FlatClientProperties.STYLE, "" +
            "font: bold +2"
        );

        encryptionDataResult = new JTextArea();
        encryptionDataResult.setRows(10);
        encryptionDataResult.setLineWrap(true);
        encryptionDataResult.setEditable(false);

        JScrollPane scrollPane1 = new JScrollPane(
            encryptionDataResult,
            JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
            JScrollPane.HORIZONTAL_SCROLLBAR_NEVER
        );

        JButton saveToDatabaseButton = new JButton("Save to Database");
        saveToDatabaseButton.putClientProperty(FlatClientProperties.STYLE, "" +
            "font: bold;"
        );

        saveToDatabaseButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                saveToDatabaseButtonActionPerformed(event);
            }
        });

        JButton saveToFileButton = new JButton("Save to File");
        saveToFileButton.putClientProperty(FlatClientProperties.STYLE, "" +
            "font: bold;"
        );

        saveToFileButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                saveToFileButtonActionPerformed(event);
            }
        });

        saveOptions = new JPanel(new MigLayout());
        saveOptions.add(saveToDatabaseButton);
        saveOptions.add(saveToFileButton);
        saveOptions.putClientProperty(FlatClientProperties.STYLE, "" +
            "opaque: false"
        );

        thirdPanel = new JPanel(new MigLayout("wrap, fillx, insets 30 45", "fill, 500:280"));
        thirdPanel.putClientProperty(FlatClientProperties.STYLE,
            "" +
            "arc: 20;" +
            "background:lighten(#2C2C3B, 3%);"
        );
        thirdPanel.add(message3);
        thirdPanel.add(encryptionKeyResultLabel, "gapy 5");
        thirdPanel.add(encryptionKeyResult);
        thirdPanel.add(encryptionDataResultLabel, "gapy 5");
        thirdPanel.add(scrollPane1);
        thirdPanel.add(saveOptions, "gapafter push");
        thirdPanel.add(backButton1, "gapbefore push");



        this.add(firstPanel, "1");
        this.add(secondPanel, "2");
        this.add(thirdPanel, "3");
    }

    private void nextButtonActionPerformed(ActionEvent event) {
        cardLayout.next(this);
    }

    private void backButtonActionPerformed(ActionEvent event) {
        cardLayout.previous(this);
    }

    private void chooseFileButtonActionPerformed(ActionEvent event) {
        try {
            fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File("C:\\Users\\cyxkr\\Documents\\Programming\\Java\\"));
            int response = fileChooser.showOpenDialog(null);

            if (response == JFileChooser.APPROVE_OPTION) {
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());

                String fileString = FileUtils.readFileToString(file, "UTF-8");
                dataToEncrypt.setText(fileString);

            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void applyButtonActionPerformed(ActionEvent event) {

        try {
            String fileString = dataToEncrypt.getText();
            String key = encryptionKey.getText();
            String algorithm = (String) messageAlgorithmsCombo.getSelectedItem();
            String resultData;

            if (appProcessCombo.getSelectedItem() == "Encrypt") {
                resultData = AdvancedEncryptionStandard.encrypt(fileString, key, algorithm);
                Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.BOTTOM_RIGHT, "Data encrypted successfully.");
            } else {
                resultData = AdvancedEncryptionStandard.decrypt(fileString, key, algorithm);
                Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.BOTTOM_RIGHT, "Data decrypted successfully.");
            }

            encryptionKeyResult.setText(key);
            encryptionDataResult.setText(resultData);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void saveToDatabaseButtonActionPerformed(ActionEvent event) {

        try {

            // Getting the driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Getting the connection to the database
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/gui_db", "root", "");

            // The SQL statement to be sent
            String query = "INSERT INTO crypt_table(crypto_key, crypto_data, crypto_algorithm) values(?, ?, ?)";

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            String crypto_key = encryptionKeyResult.getText();
            String crypto_data = encryptionDataResult.getText();
            String crypto_algorithm = (String) messageAlgorithmsCombo.getSelectedItem();

            preparedStatement.setString(1, crypto_key);
            preparedStatement.setString(2, crypto_data);
            preparedStatement.setString(3, crypto_algorithm);

            int i = preparedStatement.executeUpdate();

            if (i >= 1) {
                Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.BOTTOM_RIGHT, "Data inserted successfully.");
            } else {
                Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.BOTTOM_RIGHT, "Error experienced while inserting data.");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void saveToFileButtonActionPerformed(ActionEvent event) {

        try {
            fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File("C:\\Users\\cyxkr\\Documents\\Programming\\Java\\"));
            int response = fileChooser.showSaveDialog(null);

            String crypto_key = encryptionKeyResult.getText();
            String crypto_data = encryptionDataResult.getText();
            String crypto_algorithm = (String) messageAlgorithmsCombo.getSelectedItem();
            // fileChooser.setSelectedFile(new File(crypto_key + "-" + crypto_algorithm));

            if (response == JFileChooser.APPROVE_OPTION) {
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                String fileData = "\nKEY: " + crypto_key + "\nDATA: " + crypto_data + "\nALGORITHM: " + crypto_algorithm
                        + "\n";

//                file.createNewFile();
                if(file.createNewFile()) {
                    Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.BOTTOM_RIGHT, "File created successfully!");
                } else {
                    Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.BOTTOM_RIGHT, "Error in creating file");
                }

//                System.out.println("File created successfully!");

                FileWriter writer = new FileWriter(file);
                writer.write(fileData);

                writer.close();

            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
