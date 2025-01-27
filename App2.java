package com.mycompany.javaapp1;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class App2 extends Application {
    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();

        Scene scene = new Scene(root, 200, 300);

        MenuBar menubar = new MenuBar();

        Menu FileMenu = new Menu("File");
        MenuItem filemenu1 = new MenuItem("New");
        MenuItem filemenu2 = new MenuItem("Save");
        MenuItem filemenu3 = new MenuItem("Exit");
        FileMenu.getItems().addAll(filemenu1, filemenu2, filemenu3);

        Menu EditMenu = new Menu("Edit");
        MenuItem EditMenu1 = new MenuItem("Cut");
        MenuItem EditMenu2 = new MenuItem("Copy");
        MenuItem EditMenu3 = new MenuItem("Paste");
        EditMenu.getItems().addAll(EditMenu1, EditMenu2, EditMenu3);

        menubar.getMenus().addAll(FileMenu, EditMenu);

        root.setTop(menubar);

        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX Menu Example");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
