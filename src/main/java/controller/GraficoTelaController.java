package controller;

import Sinapsi.Sinapsi;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

import java.util.Calendar;
import java.util.TimeZone;

public class GraficoTelaController {
    @FXML
    private BarChart saldo;

    @FXML
    public void initialize() {
        saldo.setBarGap(10000.00);
        saldo.setBarGap(10030.00);
        saldo.setBarGap(10035.00);
        saldo.setBarGap(10035.00);
        saldo.setBarGap(10335.00);
        saldo.setBarGap(10535.00);
        saldo.setBarGap(10935.00);
    }

}

