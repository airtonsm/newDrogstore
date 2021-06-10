package com.airton.newdrogstone.service;

import com.airton.newdrogstone.entidades.CategoriaProduto;
import com.airton.newdrogstone.repositorios.CategoriaRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepositorio repositorio;

    public List<CategoriaProduto> listarTodos(){
        return repositorio.findAll();
    }

}
