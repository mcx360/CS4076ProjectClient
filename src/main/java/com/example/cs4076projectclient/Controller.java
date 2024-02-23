package com.example.cs4076projectclient; /**
 * Sample Skeleton for 'CS4076 FrontEnd.fxml' Controller Class
 */

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;

public class Controller {
    @FXML
    private TextField mainTextField;

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {

    }

    public void getContents(ActionEvent e){
        System.out.println(mainTextField.getCharacters());
    }

}
