package com.example.loginsystem;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

class AdminAccount{
    static String adminUsername = "admin";
    static String adminPassword = "admin";
}

public class LoginController {
    @FXML
    private TextField usernameField;
    @FXML
    private PasswordField passwordField;

    private Scene scene;
    private Stage stage;

    public void login() {
        if (usernameField.getText().equals(AdminAccount.adminUsername) && passwordField.getText().equals(AdminAccount.adminPassword)){
            System.out.println("Admin Account");
        }else{
            System.out.println("Normal account");
        }
    }

    public void signUp(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("signUp-page.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setResizable(false);
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}