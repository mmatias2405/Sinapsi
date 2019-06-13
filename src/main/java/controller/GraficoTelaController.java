package controller;

import Sinapsi.Sinapsi;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

import java.util.Calendar;
import java.util.TimeZone;

public class GraficoTelaController {
    @FXML
    private BarChart saldo;

    @FXML
    public void initialize() {
        Sinapsi.graphic();
    }

}

