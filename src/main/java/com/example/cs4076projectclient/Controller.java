package com.example.cs4076projectclient; /**
 * Sample Skeleton for 'CS4076 FrontEnd.fxml' Controller Class
 */

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;

public class Controller {
    @FXML
    private TextField mainTextField;

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML
    private ComboBox selectYear;

    @FXML
    private ListView classParticipants;

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        //selectYear.getItems().removeAll(selectYear.getItems());
        selectYear.getItems().addAll("Year:1","Year:2","Year:3","Year:4","Year:5");
        ArrayList<String> noParticipants = new ArrayList<>();
        noParticipants.add("Select Course to display");
        noParticipants.add("the participants e.g");
        noParticipants.add("Proffesors, Ta's and students");
        classParticipants.getItems().addAll(noParticipants);
    }

    public void getContents(ActionEvent e){
        System.out.println(mainTextField.getCharacters());
    }

}
