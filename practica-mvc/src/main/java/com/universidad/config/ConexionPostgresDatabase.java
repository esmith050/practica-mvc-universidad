package com.universidad.config;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionPostgresDatabase {

    private static final String URL = "jdbc:postgresql://localhost:5432/postgres";
    private static final String USER = "postgres";
    private static final String PASSWORD = "elunico123";

    public static Connection getConnection() {
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println(" Conexión exitosa a PostgreSQL");
        } catch (Exception e) {
            System.out.println(" Error de conexión");
            e.printStackTrace();
        }

        return conn;
    }
}