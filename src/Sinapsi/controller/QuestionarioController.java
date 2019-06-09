package Sinapsi.controller;

import Sinapsi.MainSinapsi;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class QuestionarioController {
    @FXML
    private Button btnOption1;
    @FXML
    private Button btnOption2;
    @FXML
    private Button btnOption3;
    @FXML
    private Button btnOption4;
    @FXML
    private Button btnOption5;
    @FXML
    private Button btnInvestProfileBack;

    private String opcao="testeteste";

    @FXML
    public void saveOption1(ActionEvent event){
        opcao = btnOption1.getText();
        System.out.println(opcao);
        Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("../view/Questionario2.fxml"));
        } catch (IOException ex) {
            System.out.println(ex);
        }
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}

