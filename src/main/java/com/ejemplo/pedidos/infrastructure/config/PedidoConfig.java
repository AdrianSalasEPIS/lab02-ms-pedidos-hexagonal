package com.ejemplo.pedidos.infrastructure.config;

import com.ejemplo.pedidos.application.RegistrarPedidoUseCase;
import com.ejemplo.pedidos.domain.port.PedidoRepositoryPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PedidoConfig {
    @Bean
    RegistrarPedidoUseCase registrarPedido(PedidoRepositoryPort port) {
        return new RegistrarPedidoUseCase(port);
    }
}
