package com.example.cs4076projectclient;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class ClientApplication extends Application{

    @Override
    public void start(Stage primaryStage) {
        try {
            // Load the FXML file
            FXMLLoader loader = new FXMLLoader(getClass().getResource("CS4076 FrontEnd.fxml"));
            Parent root = loader.load();

            // Create the scene
            Scene scene = new Scene(root, 1280, 800);


            // Set the scene to the stage
            primaryStage.setScene(scene);
            primaryStage.show();
            primaryStage.setTitle("University Class Scheduler");

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch();
    }
}