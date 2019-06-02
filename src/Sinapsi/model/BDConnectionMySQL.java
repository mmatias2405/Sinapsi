package Sinapsi.model;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class BDConnectionMySQL extends BDConnection {
    
    public BDConnectionMySQL() {
        
        this.driver = "com.mysql.cj.jdbc.Driver";
        this.porta = 3306;
        this.servidor = "db4free.net";
        this.bd = "projetoInter";
        this.usuario = "intersi";
        this.senha = "jzU3J9CpQyKyXPb";
    }

    @Override
    public java.sql.Connection getConnection() {
        
        try {
            
            Class.forName(driver);
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            con = DriverManager.getConnection(getURL(), usuario, senha);

        } catch (SQLException ex) {
            Logger.getLogger(BDConnectionMySQL.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "ERRO AO CARREGAR DRIVE");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BDConnectionMySQL.class.getName()).log(Level.SEVERE, null, ex);
        }

        return con;

    }

    @Override
    public String getURL() {
        return "jdbc:mysql://" + this.servidor + ":" + this.porta + "/" + this.bd 
                + "?useTimezone=true&serverTimezone=UTC";
    }

}
