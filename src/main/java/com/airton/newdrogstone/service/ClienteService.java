package com.airton.newdrogstone.service;

import com.airton.newdrogstone.entidades.Cliente;

import com.airton.newdrogstone.repositorios.ClienteRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepositorio repositorio;

    public List<Cliente> listarTodos(){
        return repositorio.findAll();
    }


}
