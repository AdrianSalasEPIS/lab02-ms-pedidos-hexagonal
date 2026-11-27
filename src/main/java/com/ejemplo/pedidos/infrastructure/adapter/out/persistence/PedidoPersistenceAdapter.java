package com.ejemplo.pedidos.infrastructure.adapter.out.persistence;

import com.ejemplo.pedidos.domain.model.Pedido;
import com.ejemplo.pedidos.domain.port.PedidoRepositoryPort;
import org.springframework.stereotype.Repository;

@Repository
public class PedidoPersistenceAdapter implements PedidoRepositoryPort {
    private final PedidoJpaRepository jpa;
    public PedidoPersistenceAdapter(PedidoJpaRepository jpa) {
        this.jpa = jpa;
    }
    @Override
    public Pedido guardar(Pedido p) {
        PedidoEntity entidad = jpa.save(
            new PedidoEntity(p.cantidad(), p.precioUnitario(), p.total()));
        return new Pedido(entidad.getId(), entidad.getCantidad(),
            entidad.getPrecioUnitario(), entidad.getTotal());
    }
}
