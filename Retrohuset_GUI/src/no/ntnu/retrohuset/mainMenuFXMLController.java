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
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.shape.Shape;

/**
 *
 * @author Kjetil
 */
public class mainMenuFXMLController implements Initializable {

    @FXML
    private MenuBar menuBar;
    
    @FXML
    private Menu fileMenu;

    @FXML
    private Menu editMenu;

    @FXML
    private Menu aboutMenu;

    @FXML
    private Button addProductButton;

    @FXML
    private void openAddProductMenuAction(ActionEvent event) {
        System.out.println("open new prodcut goes here");
    }
    
    @FXML
    private Button editProductButton;
    
    @FXML
    private void openEditProductMenuAction(ActionEvent event){
        System.out.println("open view for edititng of products.");
    }

    @FXML
    private Button addCustomerButton;

    @FXML
    private void openAddCustomerMenuAction(ActionEvent event) {
        System.out.println("open new customer menu goes here");
    }
    
    @FXML
    private Button editCustomerButton;
    
    @FXML
    private void openEditCustomerMenuAction(ActionEvent event){
        System.out.println("Editing customer menu appears");
    }
    
    @FXML
    private void placeholder1Action(ActionEvent event){
        System.out.println("PH1");
    }
    
    @FXML
    private void placeholder2Action(ActionEvent event){
        System.out.println("PH2");
    }
    
    

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        fileMenu = new Menu("File");
        editMenu = new Menu("Edit");
        aboutMenu = new Menu("About");
        
        addCustomerButton = new Button();
        addProductButton = new Button();
        
        editProductButton = new Button();
        editCustomerButton = new Button();
        
    }

}
