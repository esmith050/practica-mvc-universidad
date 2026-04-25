package com.universidad.config;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionPostgresDatabase {

    private static final String URL = "jdbc:postgresql://localhost:5432/universidad";
    private static final String USER = "postgres";
    private static final String PASSWORD = "123456"; // cámbiala por la tuya

    public static Connection getConnection() {
        Connection conn = null;

        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println(" Conexión exitosa a PostgreSQL");

        } catch (Exception e) {
            System.out.println(" Error en la conexión");
            e.printStackTrace();
        }

        return conn;
    }
}