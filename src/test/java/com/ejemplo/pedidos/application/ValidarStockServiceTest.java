package com.ejemplo.pedidos.application;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ValidarStockServiceTest {
    private final ValidarStockService servicio = new ValidarStockService();

    @Test
    void hayStockCuandoAlcanza() {
        assertTrue(servicio.tieneStock(10, 10));
    }

    @Test
    void noHayStockCuandoFalta() {
        assertFalse(servicio.tieneStock(2, 5));
    }

    @Test
    void rechazaCantidadInvalida() {
        assertThrows(IllegalArgumentException.class, () -> servicio.tieneStock(5, 0));
    }
}
