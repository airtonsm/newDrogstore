package com.airton.newdrogstone.service;

import com.airton.newdrogstone.entidades.Pedido;
import com.airton.newdrogstone.repositorios.PedidoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepositorio repositorio;

    public List<Pedido> listarTodos(){
        return repositorio.findAll();
    }

}
