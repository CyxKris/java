package com.cyx;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.fonts.roboto_mono.FlatRobotoMonoFont;
import com.formdev.flatlaf.intellijthemes.FlatMonocaiIJTheme;

import net.miginfocom.swing.MigLayout;
import raven.toast.Notifications;

public class ImageDB extends JFrame {

    JTextField photoPathField;
    JPanel buttonPanel;
    JButton chooseImageButton, saveToDatabaseButton;
    JLabel photoImage;

    JFileChooser fileChooser;

    public ImageDB() {
        init();
    }

    public void init() {
        setTitle("Image Viewer");
        setSize(800, 600);
        setLayout(new MigLayout("fill, insets 20", "[center]", "[center]"));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Notifications.getInstance().setJFrame(this);

        JPanel mainPanel = new JPanel(new MigLayout("wrap, fillx, insets 30 45", "fill"));

        JLabel heading, message;

        heading = new JLabel("Hello, there!");
        heading.putClientProperty(FlatClientProperties.STYLE, "" +
                "font: bold +15");

        message = new JLabel("Choose an image below to save to the database.");
        message.putClientProperty(FlatClientProperties.STYLE, "" +
                "[light]foreground:lighten(@foreground, 30%);" +
                "[dark]foreground:darken(@foreground, 30%);" +
                "font: +2");

        photoPathField = new JTextField();

        chooseImageButton = new JButton("Choose Image");
        chooseImageButton.putClientProperty(FlatClientProperties.STYLE, "" +
                "font: bold;");

        chooseImageButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                chooseImageButtonActionPerformed(event);
            }
        });

        saveToDatabaseButton = new JButton("Save to Database");
        saveToDatabaseButton.putClientProperty(FlatClientProperties.STYLE, "" +
                "font: bold;");

        saveToDatabaseButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                saveToDatabaseButtonActionPerformed(event);
            }
        });

        buttonPanel = new JPanel(new MigLayout("insets 0"));
        buttonPanel.add(chooseImageButton);
        buttonPanel.add(saveToDatabaseButton);
        buttonPanel.putClientProperty(FlatClientProperties.STYLE, "" +
                "opaque: false");

        photoImage = new JLabel();

        JScrollPane photoPane = new JScrollPane(
                photoImage,
                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        mainPanel.add(heading);
        mainPanel.add(message);
        mainPanel.add(photoPathField, "gapy 5 0");
        mainPanel.add(buttonPanel, "gapafter push");
        mainPanel.add(photoPane);

        setContentPane(mainPanel);

        setVisible(true);
    }

    
    protected void saveToDatabaseButtonActionPerformed(ActionEvent event) {
        try {

            // *checking if the textField contains a valid file
            if (photoPathField.getText().equals("") || !new File(photoPathField.getText()).isFile()) {
                Notifications.getInstance().show(
                    Notifications.Type.ERROR,
                    Notifications.Location.BOTTOM_RIGHT,
                    "Please select a valid image!"
                );
            } else {
                // *saving the image file to the database
                Icon icon = photoImage.getIcon();

                BufferedImage image = new BufferedImage(
                    icon.getIconWidth(),
                    icon.getIconHeight(),
                    BufferedImage.TYPE_INT_RGB
                );
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                ImageIO.write(image, "jpg", byteArrayOutputStream);

                byte[] imageByte = byteArrayOutputStream.toByteArray();

                // *SET GLOBAL max_allowed_packet = 33554432
                Class.forName("com.mysql.cj.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/gui_db";
                String username = "root";
                String password = "";
                Connection connection = DriverManager.getConnection(url, username, password);

                PreparedStatement preparedStatement = null;

                String query = "INSERT INTO photo(photo_Image) VALUES(?)";

                preparedStatement = connection.prepareStatement(query);
                preparedStatement.setBytes(1, imageByte);

                int i = preparedStatement.executeUpdate();

                if (i >= 1) {
                    Notifications.getInstance().show(
                        Notifications.Type.SUCCESS,
                        Notifications.Location.BOTTOM_RIGHT,
                        "Image saved successfully."
                    );
                } else {
                    Notifications.getInstance().show(
                            Notifications.Type.ERROR,
                            Notifications.Location.BOTTOM_RIGHT,
                            "Error experienced while saving image.");
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void chooseImageButtonActionPerformed(ActionEvent event) {
        try {
            fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File("C:\\Users\\cyxkr\\Pictures"));
            // fileChooser.setFileSelectionMode()
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Images", "jpg", "jpeg", "png", "gif");
            fileChooser.setFileFilter(filter);
            int response = fileChooser.showOpenDialog(null);

            if (response == JFileChooser.APPROVE_OPTION) {
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());

                photoPathField.setText(file.getAbsolutePath());

                ImageIcon imageIcon = new ImageIcon(file.getAbsolutePath());
                imageIcon.setImage(imageIcon.getImage());

                photoImage.setIcon(imageIcon);

            } else {
                photoPathField.setText("");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    public static void main(String[] args) {
        FlatRobotoMonoFont.install();

        FlatLaf.registerCustomDefaultsSource("com.mycompany.themes");
        FlatMonocaiIJTheme.setup();
        UIManager.put("defaultFont", new Font(FlatRobotoMonoFont.FAMILY, Font.PLAIN, 14));

        new ImageDB();
    }
}
