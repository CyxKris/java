package com.cyx.anewjavafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
// import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        // FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("hello-view.fxml"));
        // Scene scene = new Scene(fxmlLoader.load(), 320, 240);

        Group root = new Group();
        Scene scene = new Scene(root, Color.web("#D7AF70", 1.0));

        // Image icon = new Image(Main.class.getResourceAsStream("/logo.png"));
        Image icon = new Image("C:\\Users\\cyxkr\\Documents\\Programming\\Java\\anewjavafx\\src\\ghost.png");

        stage.getIcons().add(icon);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}