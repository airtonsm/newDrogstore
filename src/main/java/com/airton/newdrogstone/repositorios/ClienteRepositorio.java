package com.airton.newdrogstone.repositorios;

import com.airton.newdrogstone.entidades.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepositorio extends JpaRepository<Cliente, Long> {
}
