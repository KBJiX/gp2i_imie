package fr.imie.gp2i.model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Marius on 14/01/2016.
 */
public class ConnectMySQL {

    private static ConnectMySQL instance;

    private final String DriverPath = "com.mysql.jdbc.Driver";
    private final String chainConnexion = "jdbc:mysql://%:3306";
    private final String nomBase = "file_rouge";
    private final String user = "root";
    private final String password = "";

    private Connection connection;

    private ConnectMySQL() {
        instance = this;

        this.connexion();
    }

    public static Connection getInstance() {
        if (instance == null) {
            instance = new ConnectMySQL();
        }

        return instance.connection;
    }

    public void connexion() {

        try {
            Class.forName(DriverPath);
            connection = DriverManager.getConnection(chainConnexion+"/"+nomBase, user, password);
        } catch (ClassNotFoundException | SQLException ex) {
            System.err.println(ex);
        }
    }
}
