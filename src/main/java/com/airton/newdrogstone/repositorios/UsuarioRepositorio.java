package com.airton.newdrogstone.repositorios;

import com.airton.newdrogstone.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {
}
