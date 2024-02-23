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

    private boolean createClassButtonCondition;
    private boolean removeClassButtonCondition;

    private ArrayList<String> attributes = new ArrayList<String>();

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
                                createClassButtonCondition=true;
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
                                removeClassButtonCondition=true;
                    }
                }
        );
        }

        public void updateTextField (ActionEvent e){
            if(removeClassButtonCondition & createClassButtonCondition ==true){
                removeClassButtonCondition=false;
                createClassButtonCondition=false;
                attributes.clear();
            }
            String input = mainTextField.getText();
            mainText.setText(mainText.getText() + "<user>" + input + "\n");
            if(createClassButtonCondition==true){
                attributes.add(input);
                if(attributes.size()==4){
                    createClassButtonCondition=false;
                    //make code to send of attributes and then clear the ArrayList
                }
            }
            if(removeClassButtonCondition==true){
                attributes.add(input);
                    if(attributes.size()==2){
                        removeClassButtonCondition=false;
                        //make code to send of attributes and then clear the ArrayList
                    }
                }

            mainTextField.clear();
        }

}