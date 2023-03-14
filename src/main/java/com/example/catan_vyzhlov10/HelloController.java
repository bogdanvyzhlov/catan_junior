package com.example.catan_vyzhlov10;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {

    @FXML
    private Button exitButton;

    @FXML
    private Button startHraButton;
    @FXML
    void initialize() {
        startHraButton.setOnAction(event -> {
            try {
                clickStart(event);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    @FXML
    void clickStart(ActionEvent event) throws IOException {
        startHraButton.getScene().getWindow().hide();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/com/example/catan_vyzhlov10/main-view.fxml"));
        loader.load();

        Parent root = loader.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.showAndWait();

    }

    @FXML
    void exitGame(ActionEvent event) {
    System.exit(0);
    }

}