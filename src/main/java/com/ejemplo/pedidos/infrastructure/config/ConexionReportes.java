package com.ejemplo.pedidos.infrastructure.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Conexion para reportes. Las credenciales se leen de la configuracion externa
 * (variables de entorno DB_URL, DB_USER y DB_PASSWORD), nunca del codigo fuente.
 */
@Component
public class ConexionReportes {
    private final String url;
    private final String usuario;
    private final String clave;

    public ConexionReportes(@Value("${spring.datasource.url}") String url,
                            @Value("${spring.datasource.username}") String usuario,
                            @Value("${spring.datasource.password}") String clave) {
        this.url = url;
        this.usuario = usuario;
        this.clave = clave;
    }

    public Connection abrir() throws SQLException {
        return DriverManager.getConnection(url, usuario, clave);
    }
}
