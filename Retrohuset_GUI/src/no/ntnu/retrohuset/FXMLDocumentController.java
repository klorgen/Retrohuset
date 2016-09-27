/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no.ntnu.retrohuset;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Kjetil
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private TextField inputProductName;
    
    @FXML
    private Label label;
    @FXML
    private Button button;
    
    
    @FXML
    private Button nyknapp;
    
    @FXML
    private void handleProductName(ActionEvent event){
        System.out.println(inputProductName.getText());
        //TODO 
    }
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
   @FXML
   private void click(ActionEvent event){
       System.out.println("HEIHOOOOO");
       inputProductName.setText("");
       inputProductName.setText("FUUUUUUU");
   }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
