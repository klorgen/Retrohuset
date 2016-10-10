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
 * @author Erik
 */
public class AddCustomerController implements Initializable {
    @FXML
    private TextField inputFaxNumber;
    @FXML
    private TextField inputCustomerSurname;
    @FXML
    private TextField inputCustomerAddress;
    @FXML
    private TextField inputCustomerName;
    @FXML
    private TextField inputZipNr;
    @FXML
    private Label labelFNr;
    @FXML
    private Label labelCSn;
    @FXML
    private Label labelCA;
    @FXML
    private Label labelCN;
    @FXML
    private Label labelA;
    @FXML
    private Label labelZ;
    @FXML
    private Button nextButton;
    @FXML
    private Button cancelButton;
    @FXML
    private Label fillerText;
    @FXML
    private void handleCustomerAddress(ActionEvent event) {
        System.out.println(inputCustomerAddress.getText());

        //TODO --- funksjon for lagring av addresse
    }
    
    @FXML
    private void handleCustomerName(ActionEvent event){
        System.out.println(inputCustomerName.getText());
        //TODO --- funksjon for lagring av navn
    }
    
    @FXML
    private void handleCancel(ActionEvent event) {
        System.exit(1);

    }
    
   @FXML
   private void handleNext(ActionEvent event){
       String customerName = inputCustomerName.getText();
       String customerSurname = inputCustomerSurname.getText();
       String customerAddress = inputCustomerAddress.getText();
       String customerFaxNr = inputFaxNumber.getText();
       String customerZip = inputZipNr.getText();
       System.out.println(customerName + customerSurname + customerAddress + customerFaxNr );
       

   }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
