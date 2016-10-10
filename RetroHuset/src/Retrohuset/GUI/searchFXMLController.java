package no.ntnu.retrohuset;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 *
 * @author Kjetil
 */
public class searchFXMLController implements Initializable {
    
    @FXML
    private TextField searchInput;
    
    @FXML
    private TextArea outputArea;

    /**
     * Reads input from user and clears the input field.
     *
     * @param event
     */
    @FXML
    private void searchButtonAction(ActionEvent event) {
        String input = searchInput.getText();
        searchInput.clear();
        
        outputArea.setText("");
        //TODO Search functionality to get result
        String result = "no function yet.";
        outputArea.setText(result);        
    }

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
}
