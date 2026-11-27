package com.ejemplo.pedidos.domain.model;

import java.math.BigDecimal;

public record Pedido(Long id, int cantidad,
        BigDecimal precioUnitario, BigDecimal total) {}
