package com.example.loginsystem;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {
    @FXML
    private TextField usernameField;
    @FXML
    private PasswordField passwordField;


    public void login() {
        System.out.println(usernameField.getText());
        System.out.println(passwordField.getText());
    }
}