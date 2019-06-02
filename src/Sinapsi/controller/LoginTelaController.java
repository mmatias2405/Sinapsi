package Sinapsi.controller;

import Sinapsi.model.BDFactory;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginTelaController {
    @FXML
    private Button btnLogin;
    @FXML
    private TextField txtKeyLogin;
    private String key;
    private int i=0;

    @FXML
    public void teste(ActionEvent e) {
        if(i==0) {
            try {
                Connection con = (Connection) BDFactory.getConnection();
                String sql = "INSERT INTO Trader VALUES(1,1,5);";
                Statement stm = (Statement) con.createStatement();
                stm.execute(sql);
                txtKeyLogin.setText("logou");
            } catch (SQLException ex) {
                txtKeyLogin.setText("ERRO: " + ex.getMessage());
            }
            this.i++;
        }
    }
}
