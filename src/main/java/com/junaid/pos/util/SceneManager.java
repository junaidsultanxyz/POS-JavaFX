package com.junaid.pos.util;

import com.junaid.pos.POSApplication;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneManager {
    private static Stage primaryStage;
    private static final String BASE_FXML_PATH = "/com/junaid/pos/views/";

    public static void setPrimaryStage(Stage stage) {
        primaryStage = stage;
    }

    public static void setTitle(String title) {
        primaryStage.setTitle(title);
    }

    public static void setResolution(int width, int height) {
        primaryStage.setWidth(width);
        primaryStage.setHeight(height);

    }

    public static void switchScene(String fxmlScene, String role) {
        StringBuilder fullPath = new StringBuilder(BASE_FXML_PATH).append(role).append("/").append(fxmlScene).append(".fxml");

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(SceneManager.class.getResource(fullPath.toString()));
            Parent root = fxmlLoader.load();
            Scene scene = new Scene(root);

            primaryStage.setScene(scene);
            primaryStage.show();
        }
        catch (IOException e) {
            System.err.println("Failed to load scene: " + fxmlScene + "~" +  role);
            e.printStackTrace();
        }
    }
}
