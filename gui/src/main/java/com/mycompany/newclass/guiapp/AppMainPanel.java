package com.mycompany.newclass.guiapp;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
// import org.apache.commons.io.FileUtils;

import com.formdev.flatlaf.FlatClientProperties;
import com.mycompany.newclass.ConsoleImage;

import net.miginfocom.swing.MigLayout;
import raven.toast.Notifications;


public class AppMainPanel extends JPanel {

    JPanel imageForm;
    JTextField imagePathField;
    JButton chooseImageButton, saveImageButton, retrieveImageButton;

    JFileChooser fileChooser;

    ConsoleImage consoleImage = new ConsoleImage();

    public AppMainPanel() {
        init();
    }

    public void init() {
        setLayout(new MigLayout("fill, insets 20", "[center]", "[center]"));


        // ?THE MAIN CONTENT OF THE APPLICATION
        JLabel heading, message;
        JPanel buttonPanel;

        heading = new JLabel("Hello, there!");
        heading.putClientProperty(FlatClientProperties.STYLE, "" +
            "font: bold +15"
        );


        message = new JLabel("Choose an image below to save to the database.");
        message.putClientProperty(FlatClientProperties.STYLE, "" +
            "[light]foreground:lighten(@foreground, 30%);" +
            "[dark]foreground:darken(@foreground, 30%);" +
            "font: +2"
        );

        imagePathField = new JTextField();



        chooseImageButton = new JButton("Choose Image");
        chooseImageButton.putClientProperty(FlatClientProperties.STYLE, "" +
            "font: bold;"
        );

        chooseImageButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                chooseImageButtonActionPerformed(event);
            }
        });


        saveImageButton = new JButton("Save Image");
        saveImageButton.putClientProperty(FlatClientProperties.STYLE, "" +
            "font: bold;"
        );

        saveImageButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                saveImageButtonActionPerformed(event);
            }
        });


        retrieveImageButton = new JButton("Retrieve Image");
        retrieveImageButton.putClientProperty(FlatClientProperties.STYLE, "" +
            "font: bold;"
        );

        retrieveImageButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                retrieveImageButtonActionPerformed(event);
            }
        });


        buttonPanel = new JPanel(new MigLayout("insets 0"));
        buttonPanel.add(saveImageButton);
        buttonPanel.add(retrieveImageButton);
        buttonPanel.putClientProperty(FlatClientProperties.STYLE, "" +
            "opaque: false"
        );




        // *THE IMAGE FORM PANEL
        imageForm = new JPanel(new MigLayout("wrap, fillx, insets 30 45", "fill, 500:280"));
        imageForm.putClientProperty(FlatClientProperties.STYLE, "" +
            "arc: 20;" +
            "background:lighten(#191A21, 3%);"
        );

        imageForm.add(heading);
        imageForm.add(message);
        imageForm.add(imagePathField, "gapy 5 0");
        imageForm.add(chooseImageButton, "gapafter push");
        imageForm.add(buttonPanel, "gapafter push, gapy 20");




        // ?ADDING THE MAIN CONTENT
        add(imageForm);
    }

    protected void saveImageButtonActionPerformed(ActionEvent event) {
        try {
            if (imagePathField.getText().equals("") || !new File(imagePathField.getText()).isFile()) {
                Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.BOTTOM_RIGHT,
                    "Choose a valid file!"
                );
            } else {
                consoleImage.databaseConnect(imagePathField.getText());
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    protected void retrieveImageButtonActionPerformed(ActionEvent event) {
        System.out.println("Image retrieved!");
    }

    protected void chooseImageButtonActionPerformed(ActionEvent event) {

        try {
            fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File("C:\\Users\\cyxkr\\Documents\\Programming\\Java\\"));
            // fileChooser.setFileSelectionMode()
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Images", "jpg", "jpeg", "png", "gif");
            fileChooser.setFileFilter(filter);
            int response = fileChooser.showOpenDialog(null);

            if (response == JFileChooser.APPROVE_OPTION) {
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());

                imagePathField.setText(file.getAbsolutePath());

                // String fileString = FileUtils.readFileToString(file, "UTF-8");
            } else {
                imagePathField.setText("");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
