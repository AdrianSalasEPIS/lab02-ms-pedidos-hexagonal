package com.ejemplo.pedidos.infrastructure.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionReportes {
    // NO USAR EN PRODUCCION: credencial codificada
    private static final String URL = "jdbc:mysql://localhost:3307/bd_pedidos";
    private static final String USER = "pedidos_app";
    private static final String PASSWORD = "admin123";

    public Connection abrir() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
