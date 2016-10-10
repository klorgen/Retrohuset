/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retrohuset;


import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Kjetil
 */
public class RetroHuset extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("AddCustomer.fxml"));
        
        double screenWidth = 500;
        double screenHeight = 400;
        
        Scene scene = new Scene(root, screenWidth, screenHeight);
        
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