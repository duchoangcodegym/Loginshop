package com.example.shop_laptop2;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TabPane tabPane;
    @FXML
    private TextField loginUsername;
    @FXML
    private PasswordField loginPassword;
    @FXML
    private Button loginButton;
    @FXML
    private Button clearLoginButton;
    @FXML
    private TextField registerUsername;
    @FXML
    private PasswordField registerPassword;
    @FXML
    private PasswordField confirmRegisterPassword;
    @FXML
    private Button registerButton;
    @FXML
    private Button clearRegisterButton;

    public HelloController() {
    }

    @FXML
    private void initialize() {
        loginButton.setOnAction(event -> handleLoginButtonAction());
        clearLoginButton.setOnAction(event -> handleClearLoginButtonAction());
        registerButton.setOnAction(event -> handleRegisterButtonAction());
        clearRegisterButton.setOnAction(event -> handleClearRegisterButtonAction());
    }

    @FXML
    private void handleLoginButtonAction() {
        String username = loginUsername.getText();
        String password = loginPassword.getText();

        // Logic kiểm tra đăng nhập (có thể thay đổi theo yêu cầu của bạn)
        if ("admin".equals(username) && "password".equals(password)) {
            showAlert(Alert.AlertType.INFORMATION, "Login Successful", "Welcome, " + username + "!");
        } else {
            showAlert(Alert.AlertType.ERROR, "Login Failed", "Sai tên đăng nhập hoặc mật khẩu.");
        }
    }

    @FXML
    private void handleClearLoginButtonAction() {
        loginUsername.clear();
        loginPassword.clear();
    }

    @FXML
    private void handleRegisterButtonAction() {
        String password = registerPassword.getText();
        String confirmPassword = confirmRegisterPassword.getText();

        if (password.equals(confirmPassword)) {
            // Logic đăng ký người dùng (có thể thay đổi theo yêu cầu của bạn)
            showAlert(Alert.AlertType.INFORMATION, "Registration Successful", "Đăng ký thành công");
        } else {
            showAlert(Alert.AlertType.ERROR, "Đăng ký không thành công", "Mật khẩu không khớp vui lòng nhập lại !.");
        }
    }

    @FXML
    private void handleClearRegisterButtonAction() {
        registerUsername.clear();
        registerPassword.clear();
        confirmRegisterPassword.clear();
    }

    private void showAlert(Alert.AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
