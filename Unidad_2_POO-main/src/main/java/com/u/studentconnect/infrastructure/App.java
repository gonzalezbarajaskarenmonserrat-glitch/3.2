package com.u.studentconnect.infrastructure;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/com/u/studentconnect/student_view.fxml"));
        primaryStage.setTitle("StudentConnect Hub - RegistroUniversitario");
        primaryStage.setScene(new Scene(root, 650, 450));
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}