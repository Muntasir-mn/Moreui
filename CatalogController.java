/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moreui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseDragEvent;

/**
 * FXML Controller class
 *
 * @author acer
 */
public class CatalogController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    private void ebar(MouseDragEvent event) throws IOException {
         Parent root = FXMLLoader.load(getClass().getResource("aro.fxml"));
       
        Scene scene = new Scene(root);
        
        Moreui.getStage().setScene(scene);
      
        Moreui.getStage().show();
    }

    @FXML
    private void action(ActionEvent event) throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("aro.fxml"));
       
        Scene scene = new Scene(root);
        
        Moreui.getStage().setScene(scene);
      
        Moreui.getStage().show();
    }
    
}
