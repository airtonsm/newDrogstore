package com.airton.newdrogstone.service;

import com.airton.newdrogstone.entidades.Usuario;
import com.airton.newdrogstone.repositorios.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepositorio repositorio;

    public List<Usuario> listarTodos(){
        return repositorio.findAll();
    }

}
