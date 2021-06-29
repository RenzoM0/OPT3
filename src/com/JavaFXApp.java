package com;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;

public class JavaFXApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/View/HomeScreen.fxml"));
            stage.setScene(new Scene(root));
            stage.setMinHeight(400);
            stage.setMinWidth(700);
            stage.setTitle("OPT3 Afspraken Maker");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
