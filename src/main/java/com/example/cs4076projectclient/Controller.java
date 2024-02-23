package com.example.cs4076projectclient; /**
 * Sample Skeleton for 'CS4076 FrontEnd.fxml' Controller Class
 */

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.input.KeyEvent;

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

    @FXML
    private Button createClassButton;

    @FXML
    private Button removeClassButton;

    @FXML
    private TextArea mainText;

    @FXML
    private Button stop;

    private String textFieldInput;


    @FXML
        // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        //selectYear.getItems().removeAll(selectYear.getItems());
        selectYear.getItems().addAll("Year:1", "Year:2", "Year:3", "Year:4", "Year:5");
        ArrayList<String> noParticipants = new ArrayList<>();
        noParticipants.add("Select Course to display");
        noParticipants.add("the participants e.g");
        noParticipants.add("Proffesors, Ta's and students");
        classParticipants.getItems().addAll(noParticipants);

        createClassButton.setOnAction(
                new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        mainText.setText(mainText.getText() + "<System>Please Enter the following information in the specified format: \n" +
                                "\tCourse code e.g [LM051]\n" +
                                "\tModule code e.g [CS4076]\n" +
                                "\tdate e.g [YYYYMMDD]\n" +
                                "\tTime e.g [HH:MM-HH:MM]\n");

                        mainText.setText(mainText.getText()+mainTextField.getText());

                    }
                }
        );

        removeClassButton.setOnAction(
                new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        mainText.setText(mainText.getText()+"Please enter the following info in the specified format:\n"+
                                "\tCourse code e.g [LM051]\n"+
                                "\tModule code e.g [CS4076]\n");
                    }
                }
        );

        }

        public void updateTextField (ActionEvent e){
            mainText.setText(mainText.getText() + "<user>" + mainTextField.getText() + "\n");
            mainTextField.clear();
        }

    }

