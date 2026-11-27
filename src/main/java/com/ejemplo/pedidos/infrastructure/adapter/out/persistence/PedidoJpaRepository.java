package com.ejemplo.pedidos.infrastructure.adapter.out.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoJpaRepository
        extends JpaRepository<PedidoEntity, Long> {}
