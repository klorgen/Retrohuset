/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no.ntnu.retrohuset;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Kjetil
 */
public class gui extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("mainMenuScene.fxml"));
        
        double screenWidth = 800;
        double screenHeight = 600;
        
        Scene scene = new Scene(root, screenWidth, screenHeight);
        scene.getStylesheets().add("no/ntnu/retrohuset/mainMenuCss.css");
        
        stage.setFullScreen(false);
        stage.setMaxHeight(screenHeight);
        stage.setMinHeight(screenHeight);
        stage.setMaxWidth(screenWidth);
        stage.setMinWidth(screenWidth);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
