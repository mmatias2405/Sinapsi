package controller;

import Sinapsi.Sinapsi;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

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
    @FXML
    private TextField txxQuestSalary;

    @FXML
    public void escolha1(ActionEvent event){
        try {
            Sinapsi.salvaOpcao(1);
        }
        catch (Exception n)
        {}

    }
    @FXML
    public void escolha2(ActionEvent event){
        try {
            Sinapsi.salvaOpcao(2);
        }
        catch (Exception n)
        {}

    }
    @FXML
    public void escolha3(ActionEvent event){
        try {
            Sinapsi.salvaOpcao(3);
        }
        catch (Exception n)
        {}

    }
    @FXML
    public void escolha4(ActionEvent event){
        try {
            Sinapsi.salvaOpcao(4);
        }
        catch (Exception n)
        {}

    }
    @FXML
    public void valor(ActionEvent event){
        try {
            String valor = txxQuestSalary.getText();
            Sinapsi.salario(valor);
        }
        catch (Exception n)
        {}

    }
    @FXML
    public void voltar(ActionEvent event){
        try {
            Sinapsi.anterior();
        }
        catch (Exception n)
        {}

    }
}

