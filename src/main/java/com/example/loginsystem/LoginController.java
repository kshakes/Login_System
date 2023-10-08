package com.example.loginsystem;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

class AdminAccount{
    static String adminUsername = "admin";
    static String adminPassword = "admin";
}

public class LoginController {
    @FXML
    private TextField usernameField;
    @FXML
    private PasswordField passwordField;

    public void login() {
        if (usernameField.getText().equals(AdminAccount.adminUsername) && passwordField.getText().equals(AdminAccount.adminPassword)){
            System.out.println("Admin Account");
        }else{
            System.out.println("Normal account");
        }
    }
}