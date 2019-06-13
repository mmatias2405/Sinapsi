package controller;

import Sinapsi.Sinapsi;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;

public class PerfilController {
    @FXML
    private Button continuar;

    @FXML
    public void next(ActionEvent event)throws IOException {
        Sinapsi.continuar();
    }
}

