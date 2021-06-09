package com.airton.newdrogstone.recursos;

import com.airton.newdrogstone.entidades.Pedido;
import com.airton.newdrogstone.service.PedidoService;
import com.airton.newdrogstone.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/pedidos")
public class PedidoRecurso {

    @Autowired
    private PedidoService service;

    @GetMapping
    public ResponseEntity<List<Pedido>> listar(){
        List<Pedido> obj = service.listarTodos();
        return ResponseEntity.ok().body(obj);
    }
}
