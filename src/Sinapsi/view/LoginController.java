package Sinapsi.view;
import Sinapsi.MainSinapsi;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.awt.*;


public class LoginController {
    @FXML
    private ImageView imgLogin;
    @FXML
    private Button btnLogar;
    @FXML
    private TextField keytxt;

    private MainSinapsi main;

    public LoginController() {
    }

    @FXML
    private void initialize(){
    }
    public void setMainApp(MainSinapsi main) {
        this.main = main;


    }
}
