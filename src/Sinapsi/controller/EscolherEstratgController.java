package Sinapsi.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TextArea;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;

public class EscolherEstratgController {
    private String estrategia1="Media Movel";
    private String estrategia2="Long And Short";
    private String estrategia3="Media Ponderada Movel";
    private String estrategia4="Bandas de Bollinger";
    private String estrategia5="Indice de Força Relativa";
    private String estrategia6="Eco Temporal";
    private String estrategiaOpcao;
    ObservableList<String> cbEstrategiasValues = FXCollections.observableArrayList
            (estrategia1,estrategia2,estrategia3,estrategia4,estrategia5,estrategia6);

    @FXML
    private ComboBox cbEstrategiasBox;
    @FXML
    private TextArea txtEstrategiaDescricao;
    @FXML
    private TextArea txtEstrategiaArea;
    @FXML
    private Button btnDescribeEstrategia;

    @FXML
    public void initialize(){
        cbEstrategiasBox.setItems(cbEstrategiasValues);
    }

    @FXML
    public void getValueCB(ActionEvent e){
        txtEstrategiaDescricao.setWrapText(true);

        estrategiaOpcao = cbEstrategiasBox.getValue().toString();
        if(estrategiaOpcao.equals(estrategia1) ){
            txtEstrategiaArea.setText(estrategiaOpcao);
            txtEstrategiaDescricao.setText("Representaçoes suavizadas dos movimentos dos preços dos ativos, que ajudam a ter uma visão mais ampla" +
                    " das tendências. dassddsadsadsadsadsasdadsadsadsasadsdadsasaddsasaddsadsads dsa das das das dasd sad sa.");

        }
    }
}
