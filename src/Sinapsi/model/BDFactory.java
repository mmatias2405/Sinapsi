package Sinapsi.model;

import java.sql.Connection;

public class BDFactory {

    public  static  Connection getConnection(){

        return new BDConnectionMySQL().getConnection();

    }

}
