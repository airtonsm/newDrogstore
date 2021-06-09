package com.airton.newdrogstone.service;

import com.airton.newdrogstone.entidades.Produto;
import com.airton.newdrogstone.repositorios.ProdutoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepositorio repositorio;

    public List<Produto> listarTodos(){
        return repositorio.findAll();
    }

}
