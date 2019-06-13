package controller;

import Sinapsi.Sinapsi;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

import java.util.Calendar;
import java.util.TimeZone;

public class acaoController {
    private String estrategiaOpcao;
    ObservableList<String> cbEstrategiasValues = FXCollections.observableArrayList
            ("VALE3", "ITUB4", "BBDC4", "ABEV3", "PETR4", "PETR3", "B3SA3", "ITSA4", "BBAS3", "UGPA3", "SUZB3", "LREN3", "FIBR3", "BBDC3");

    @FXML
    private ComboBox cbEstrategiasBox;

    @FXML
    public void enviar(ActionEvent e) throws Exception
    {
        Sinapsi.action(cbEstrategiasBox.getValue());
    }

    @FXML
    public void initialize() {
        cbEstrategiasBox.setItems(cbEstrategiasValues);
    }

}

