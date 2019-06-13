package controller;

import Sinapsi.Sinapsi;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTimePicker;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import java.time.LocalDate;

import java.time.LocalTime;
import java.util.Calendar;
import java.util.TimeZone;

public class DateFixController {

    @FXML
    private JFXDatePicker inicial;
    @FXML
    private JFXDatePicker fim;
    @FXML
    private JFXTimePicker comeco;
    @FXML
    private JFXTimePicker terminio;


    @FXML
    public void responder(ActionEvent e) throws Exception
    {
        LocalTime inicio = comeco.getValue();;
        LocalTime f = terminio.getValue();

        comeco.getValue();
        Sinapsi.data(inicio, f);
    }

}

