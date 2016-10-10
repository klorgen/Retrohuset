/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no.ntnu.retrohuset;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author Kjetil
 */
public class mainMenuFXMLController implements Initializable {

    @FXML
    private ImageView retroLogo;

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
        openScene("addProductScene.fxml");
    }

    @FXML
    private Button editProductButton;

    @FXML
    private void openEditProductMenuAction(ActionEvent event) {
        System.out.println("open view for edititng of products.");
    }

    @FXML
    private Button addCustomerButton;

    @FXML
    private void openAddCustomerMenuAction(ActionEvent event) {
        openScene("AddCustomer.fxml");
    }

    @FXML
    private Button editCustomerButton;

    @FXML
    private void openEditCustomerMenuAction(ActionEvent event) {
        System.out.println("Editing customer menu appears");
    }

    @FXML
    private void placeholder1Action(ActionEvent event) {
        System.out.println("PH1");
    }

    @FXML
    private void placeholder2Action(ActionEvent event) {
        System.out.println("PH2");
    }

    @FXML
    private TextField searchInput;

    @FXML
    private TableView outputArea;

    /**
     * Reads input from user and clears the input field.
     *
     * @param event
     */
    @FXML
    private void searchButtonAction(ActionEvent event) {
        String input = searchInput.getText();
        searchInput.clear();

        //outputArea.setText("");
        //TODO Search functionality to get result
        String result = "no function yet.";

       // outputArea.setText(input);
    }
    //------ Search section END------

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        fileMenu = new Menu("File");
        editMenu = new Menu("Edit");
        aboutMenu = new Menu("About");

        addCustomerButton = new Button();
        addProductButton = new Button();

        editProductButton = new Button();
        editCustomerButton = new Button();

        File file = new File("src/retro.jpg");
        Image image = new Image(file.toURI().toString());
        retroLogo.setImage(image);

    }

    /**
     * Open an scene with given fxml scene.
     *
     * @param openScene
     */
    private void openScene(String openScene) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource(openScene));
            Stage stage = new Stage();

            double screenWidth = 1024;
            double screenHeight = 768;

            Scene scene = new Scene(root, screenWidth, screenHeight);
            scene.getStylesheets().add("no/ntnu/retrohuset/mainMenuCss.css");

            stage.setFullScreen(false);
            stage.setMaxHeight(screenHeight);
            stage.setMinHeight(screenHeight);
            stage.setMaxWidth(screenWidth);
            stage.setMinWidth(screenWidth);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Alert alert = new Alert(Alert.AlertType.ERROR, "Could not open new product menu. Please contact Kay :p", ButtonType.OK);
            alert.showAndWait();
            if (alert.getResult() == ButtonType.OK) {
                alert.close();
            }
        }
    }
}
