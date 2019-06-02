package Sinapsi.model;

import java.sql.Connection;

public abstract class BDConnection {

    protected java.sql.Connection con;
    protected String servidor;
    protected String bd;
    protected String usuario;
    protected String senha;
    protected String driver;
    protected int porta;

    public abstract java.sql.Connection getConnection();

    public abstract  String getURL();

}
