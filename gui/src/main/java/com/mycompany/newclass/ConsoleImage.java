package com.mycompany.newclass;

import raven.toast.Notifications;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ConsoleImage {

    public void databaseConnect(String imagePath) {
        try {
            // Getting the driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Getting the connection to the database
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/gui_db", "root", "");

            // The SQL statement to be sent
            // *SET GLOBAL max_allowed_packet = 33554432
            String query = "INSERT INTO image_table(image_Path, image) VALUES(?, ?)";

            PreparedStatement preparedStatement = connection.prepareStatement(query);

            FileInputStream fileInputStream = new FileInputStream(imagePath);

            preparedStatement.setString(1, imagePath);
            preparedStatement.setBinaryStream(2, fileInputStream, fileInputStream.available());

            int i = preparedStatement.executeUpdate();

            if (i >= 1) {
                Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.BOTTOM_RIGHT, "Data inserted successfully.");
            } else {
                Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.BOTTOM_RIGHT, "Error experienced while inserting data.");
            }

            // System.out.println("Image stored successfully to the database");

            preparedStatement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /*
     * CREATE TABLE image_table (
     * image_ID INT AUTO_INCREMENT,
     * image_Path VARCHAR (200) NOT NULL,
     * image LONGBLOB NOT NULL,
     * PRIMARY KEY (image_ID)
     * );
     */

    // public static void main(String[] args) {

    //     try {
    //         /* TODO: ASSIGNMENT
    //          * ASSIGNMENT
    //          * Make a gui for the program
    //          * get the image info from the gui, send it to the database
    //          * bonus: you could get the image back from the database and display it on the gui.
    //          */

    //         // Getting the driver
    //         Class.forName("com.mysql.cj.jdbc.Driver");

    //         // Getting the connection to the database
    //         Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/gui_db", "root", "");

    //         // The SQL statement to be sent
    //         String query = "INSERT INTO image_store(image_ID, image_Name) values(?, ?)";

    //         PreparedStatement preparedStatement = connection.prepareStatement(query);

    //         FileInputStream fileInputStream = new FileInputStream("images\\save.png");

    //         preparedStatement.setInt(1, 2);
    //         preparedStatement.setBinaryStream(2, fileInputStream, fileInputStream.available());

    //         preparedStatement.executeUpdate();

    //         System.out.println("Image stored successfully to the database");

    //         preparedStatement.close();
    //         connection.close();

    //     } catch (Exception e) {
    //         e.printStackTrace();
    //     }

    // }
}
