package com.ejemplo.pedidos.application;

public class ValidarStockService {

    public boolean tieneStock(int stock, int cantidad) {
        System.out.println("Validando stock: " + stock + " / " + cantidad);
        if (stock >= cantidad) {
            return true;
        } else {
            return false;
        }
    }
}
