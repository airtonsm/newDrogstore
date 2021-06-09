package com.airton.newdrogstone.repositorios;

import com.airton.newdrogstone.entidades.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepositorio extends JpaRepository<Pedido, Long> {
}
