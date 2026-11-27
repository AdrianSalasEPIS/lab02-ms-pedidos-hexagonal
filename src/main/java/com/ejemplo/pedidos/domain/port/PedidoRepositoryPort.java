package com.ejemplo.pedidos.domain.port;

import com.ejemplo.pedidos.domain.model.Pedido;

public interface PedidoRepositoryPort {
    Pedido guardar(Pedido pedido);
}
