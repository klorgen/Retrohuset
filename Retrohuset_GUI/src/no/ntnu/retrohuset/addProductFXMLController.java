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
public class addProductFXMLController implements Initializable {
    
    @FXML
    private Label productID;
    
    @FXML
    private Label productNameLabel;
    
    @FXML
    private TextField inputProductName;
    
    @FXML
    private Label categoryIDLabel;
    
    @FXML 
    private TextField inputCategoryID;
    
    @FXML
    private Label storageCountLabel;
    
    @FXML
    private TextField inputStorageCount;
    
    @FXML
    private Label priceLabel;
    
    @FXML
    private TextField inputPrice;
    
    @FXML
    private Button okButton;    
    
    @FXML
    private void okButtonAction(ActionEvent event){
        System.out.println("OK");
        //TODO create a product and send to java to be put into the database.
    }
    
    @FXML
    private Button cancelButton;
    
    @FXML
    private void cancelButtonAction(ActionEvent event){
        System.out.println("CANCEL");
        //TODO reset all fields and return to previous scene.
    }
        
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        productID.setText("PRODUCT ID(auto)"); //TODO get autoincrement from DB
        okButton.setText("OK");
        cancelButton.setText("CANCEL");
        productNameLabel.setText("Product name:");
        categoryIDLabel.setText("CategoryID:");
        storageCountLabel.setText("Storage count:");
        priceLabel.setText("Price:");
        
        
    }    
    
}
