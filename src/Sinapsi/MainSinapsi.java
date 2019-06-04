package Sinapsi;

import Sinapsi.controller.EscolherEstratgController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainSinapsi extends Application {

    private Stage primaryStage;
    private Stage secondStage;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Sinapsi");

        showLogin();


    }

    public void showLogin() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainSinapsi.class.getResource("view/EscolherEstratgTela.fxml"));
            AnchorPane login = loader.load();

            //LoginController controller = loader.getController();
            //controller.setMainApp(this);

            Scene scene = new Scene(login);
            primaryStage.setScene(scene);

            primaryStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
