package Sinapsi.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Timer;
import java.util.TimeZone;

public class EscolherEstratgController {
    private String estrategia1 = "Media Movel";
    private String estrategia2 = "Long And Short";
    private String estrategia3 = "Media Ponderada Movel";
    private String estrategia4 = "Bandas de Bollinger";
    private String estrategia5 = "Indice de Força Relativa";
    private String estrategia6 = "Eco Temporal";
    private String estrategiaOpcao;
    ObservableList<String> cbEstrategiasValues = FXCollections.observableArrayList
            (estrategia1, estrategia2, estrategia3, estrategia4, estrategia5, estrategia6);

    @FXML
    private ComboBox cbEstrategiasBox;
    @FXML
    private TextArea txtEstrategiaDescricao;
    @FXML
    private TextArea txtEstrategiaArea;
    @FXML
    private Label lblTeste;
    @FXML
    private TextField txtHora;

    Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("Brazil/East"));
    int hora = calendar.get(Calendar.HOUR_OF_DAY);
    int minuto = calendar.get(Calendar.MINUTE);
    int segundo = calendar.get(Calendar.SECOND);



        @FXML
        public void initialize() {
            cbEstrategiasBox.setItems(cbEstrategiasValues);
            txtHora.setText(""+hora+":"+minuto+":"+segundo);
        }

        @FXML
        public void getValueCB(ActionEvent e) {
            txtEstrategiaDescricao.setWrapText(true);
            txtEstrategiaArea.setWrapText(true);

            estrategiaOpcao = cbEstrategiasBox.getValue().toString();
            if (estrategiaOpcao.equals(estrategia1)) {
                //txtEstrategiaArea.setText(estrategiaOpcao);
                lblTeste.setWrapText(true);
                lblTeste.setText("Indice de Forca Relativa");
                txtEstrategiaDescricao.setText("Representaçoes suavizadas dos movimentos dos preços dos ativos, que ajudam a ter uma visão mais ampla" +
                        " das tendências. dassddsadsadsadsadsasdadsadsadsasadsdadsasaddsasaddsadsads dsa das das das dasd sad sa.");

            }
        }
    }

