package com.example.cs4076projectclient;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ClientApplication extends Application{

    @Override
    public void start(Stage primaryStage) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("CS4076 FrontEnd.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root, 1280, 800);

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