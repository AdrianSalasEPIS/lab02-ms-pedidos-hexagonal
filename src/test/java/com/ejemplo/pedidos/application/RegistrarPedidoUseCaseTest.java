package com.ejemplo.pedidos.application;

import static org.junit.jupiter.api.Assertions.*;
import java.math.BigDecimal;
import java.util.concurrent.atomic.AtomicLong;
import com.ejemplo.pedidos.domain.model.Pedido;
import com.ejemplo.pedidos.domain.port.PedidoRepositoryPort;
import org.junit.jupiter.api.Test;

class RegistrarPedidoUseCaseTest {
    private final AtomicLong ids = new AtomicLong();
    private final PedidoRepositoryPort fake = p ->
        new Pedido(ids.incrementAndGet(), p.cantidad(),
            p.precioUnitario(), p.total());
    private final RegistrarPedidoUseCase useCase =
        new RegistrarPedidoUseCase(fake);

    @Test
    void registraPedidoYCalculaTotal() {
        Pedido p = useCase.registrar(3, new BigDecimal("150.00"));
        assertEquals(new BigDecimal("450.00"), p.total());
        assertNotNull(p.id());
    }

    @Test
    void rechazaCantidadInvalida() {
        assertThrows(IllegalArgumentException.class,
            () -> useCase.registrar(0, new BigDecimal("150.00")));
    }

    @Test
    void rechazaPrecioInvalido() {
        assertThrows(IllegalArgumentException.class,
            () -> useCase.registrar(2, BigDecimal.ZERO));
    }
}
