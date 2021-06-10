package com.airton.newdrogstone.repositorios;

import com.airton.newdrogstone.entidades.CategoriaProduto;
import com.airton.newdrogstone.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepositorio extends JpaRepository<CategoriaProduto, Long> {
}
