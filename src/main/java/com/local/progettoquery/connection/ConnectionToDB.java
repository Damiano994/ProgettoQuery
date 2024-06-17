package com.local.progettoquery.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionToDB {
    private static final String URL = "jdbc:mysql://localhost:3306/progettolambda";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";


    Connection connection = null;


    public Connection connectionToDB() {
        {

            try {

                // Caricamento del driver JDBC
                Class.forName("com.mysql.cj.jdbc.Driver");

                // Connessione al database
                connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
                System.out.println("Connessione al database stabilita!");
            } catch (ClassNotFoundException e) {
                System.out.println("Driver JDBC non trovato.");
                e.printStackTrace();
            } catch (SQLException e) {
                System.out.println("Errore durante la connessione al database.");
                e.printStackTrace();
            }
            return connection;
        }
    }
}
