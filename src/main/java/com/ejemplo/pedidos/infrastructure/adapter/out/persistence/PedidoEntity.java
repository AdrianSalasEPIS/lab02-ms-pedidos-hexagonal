package com.ejemplo.pedidos.infrastructure.adapter.out.persistence;

import java.math.BigDecimal;
import jakarta.persistence.*;

@Entity
@Table(name = "pedido")
public class PedidoEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private int cantidad;
    @Column(nullable = false, precision = 12, scale = 2)
    private BigDecimal precioUnitario;
    @Column(nullable = false, precision = 12, scale = 2)
    private BigDecimal total;

    protected PedidoEntity() {}
    public PedidoEntity(int cantidad, BigDecimal precio, BigDecimal total) {
        this.cantidad = cantidad;
        this.precioUnitario = precio;
        this.total = total;
    }
    public Long getId() { return id; }
    public int getCantidad() { return cantidad; }
    public BigDecimal getPrecioUnitario() { return precioUnitario; }
    public BigDecimal getTotal() { return total; }
}
