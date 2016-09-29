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
    private void openAddProductMenu(ActionEvent event) {
        System.out.println("open new prodcut goes here");
    }

    @FXML
    private Button addCustomerButton;

    @FXML
    private void openAddCustomerMenu(ActionEvent event) {
        System.out.println("open new customer menu goes here");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        menuBar = new MenuBar();
        fileMenu = new Menu("File");
        editMenu = new Menu("Edit");
        aboutMenu = new Menu("About");
        
        addCustomerButton = new Button();
        addProductButton = new Button();
        
    }

}
