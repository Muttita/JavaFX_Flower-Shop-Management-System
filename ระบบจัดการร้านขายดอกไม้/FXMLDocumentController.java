/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package javafxapplication4;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author Acer
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Button close;
    
    @FXML
    private Button loginBtn;

    @FXML
    private AnchorPane main_form;

    @FXML
    private PasswordField password;

    @FXML
    private TextField username;
   
    // database tool
    private Connection connect;
    private PreparedStatement prepare;
    private ResultSet result;
    
    private double x = 0.0;
    private double y = 0.0;
    
    public void login(){
    String sql = "SELECT * FROM admin WHERE username = ? and password = ?";
    connect = database.connectDb();
    
    try{
        prepare = connect.prepareStatement(sql);
        prepare.setString(1, username.getText());
        prepare.setString(2, password.getText());
    
        result = prepare.executeQuery();
        Alert alert;
        
        if(username.getText().isEmpty() || password.getText().isEmpty()){
            alert = new  Alert(AlertType.ERROR);
            alert.setTitle("Error Maessage");
            alert.setHeaderText(null);
            alert.setContentText("Please fill all blank fields");
            alert.showAndWait();
            
        }else{
            if(result.next()){
                //if correct username and password proceed to dashboard
                
                
                alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Information Message");
                alert.setHeaderText(null);
                alert.setContentText("Successfully Login!");
                alert.showAndWait();
                
                getData.username = username.getText();
                
                //to hide login form
                loginBtn.getScene().getWindow().hide();
                
                
                //Link my dashboard
                Parent root = FXMLLoader.load(getClass().getResource("dashboard.fxml"));
                Stage stage = new Stage();
                Scene scene = new Scene(root);
                
                root.setOnMousePressed((MouseEvent event) -> {
                    x = event.getSceneX();
                    y = event.getSceneY();
                });
                
                root.setOnMouseDragged((MouseEvent event) -> {
                    stage.setX(event.getSceneX() - x);
                    stage.setY(event.getSceneY() - y);
                });
                
                stage.initStyle(StageStyle.TRANSPARENT);
                
                stage.setScene(scene);
                stage.show();
            }else{
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Wrong Username/Password");
                alert.showAndWait();
            }
        }
    }catch(Exception e){e.printStackTrace();}
    }
    
    
    public void close(){
        System.exit(0);
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
