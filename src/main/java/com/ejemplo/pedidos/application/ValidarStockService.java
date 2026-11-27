package com.ejemplo.pedidos.application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ValidarStockService {

    private static final Logger LOG = LoggerFactory.getLogger(ValidarStockService.class);

    public boolean tieneStock(int stock, int cantidad) {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("Cantidad invalida");
        }
        LOG.debug("Validando stock: {} / {}", stock, cantidad);
        return stock >= cantidad;
    }
}
