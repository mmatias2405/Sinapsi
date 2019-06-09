package Sinapsi;

import Sinapsi.controller.EscolherEstratgController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainSinapsi extends Application {

    private static Stage stage;
    private static Scene sceneQuest1;
    private static Scene sceneLogin;
    private static Scene sceneQuest2;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;
        Parent fxmlLogin = FXMLLoader.load(getClass().getResource("../view/Questionario1.fxml"));
        sceneLogin = new Scene(fxmlLogin);
        Parent fxmlQuest1 = FXMLLoader.load(getClass().getResource("../view/Questionario1.fxml"));
        sceneQuest1 = new Scene(fxmlQuest1);
        Parent fxmlQuest2 = FXMLLoader.load(getClass().getResource("../view/Questionario2.fxml"));
        sceneQuest2 = new Scene(fxmlQuest2);

        changeScreen("login");
    }
    public static void changeScreen(String screen){
        switch(screen) {
            case"Quest1":
                stage.setScene(sceneQuest1);
                break;
            case"Quest2":
                stage.setScene(sceneQuest2);
                break;
            case"login":
                stage.setScene(sceneLogin);
                break;
        }
    }

}
