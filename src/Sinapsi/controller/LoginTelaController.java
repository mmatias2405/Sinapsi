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
    public void Login(ActionEvent e) {
        //key = txtKeyLogin.getText();
        System.out.println("teste aaaa2");
        if(i==0) {
            try {
                Connection con = (Connection) BDFactory.getConnection();
                String sql = "INSERT INTO trader VALUES(1,1,5);";
                Statement stm = (Statement) con.createStatement();
                stm.executeUpdate(sql);
                System.out.println(key);
            } catch (SQLException ex) {
                System.out.println(key);
                System.out.println(ex.getMessage());
            }i++;
        }
        System.out.println(key);
    }
    }
}
