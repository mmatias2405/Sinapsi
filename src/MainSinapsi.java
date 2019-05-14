import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import view.LoginController;

import java.io.IOException;

public class MainSinapsi extends Application {

    private Stage primaryStage;

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
            loader.setLocation(MainSinapsi.class.getResource("view/Login.fxml"));
            AnchorPane login = loader.load();

            Scene scene = new Scene(login);
            primaryStage.setScene(scene);

            primaryStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
