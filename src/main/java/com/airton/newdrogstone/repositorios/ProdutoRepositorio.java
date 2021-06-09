package com.airton.newdrogstone.repositorios;

import com.airton.newdrogstone.entidades.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepositorio extends JpaRepository<Produto, Long> {
}
