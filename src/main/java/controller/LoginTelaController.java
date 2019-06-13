package controller;

import Sinapsi.Sinapsi;
import model.*;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginTelaController {
    @FXML
    private TextField txtKeyLogin;

    private String key;

    @FXML
    public void logar(ActionEvent e) throws Exception {
        this.key = txtKeyLogin.getText();
        try {
                Connection con = (Connection) BDFactory.getConnection();
                String sql = "SELECT func_insere_trader("+key+", 'localhost') AS 'func_insere_trader';";
                Statement stm = (Statement) con.createStatement();
                ResultSet rset = stm.executeQuery(sql);
                while (rset.next()) {
                    if (rset.getInt("func_insere_trader") == 1)
                        Sinapsi.continuar();
                    else
                        Sinapsi.anterior();
                }
            } catch (SQLException ex) {
                txtKeyLogin.setText("ERRO: " + ex.getMessage());
        }
    }
}
