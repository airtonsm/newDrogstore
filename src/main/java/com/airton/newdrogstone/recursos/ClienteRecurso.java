package com.airton.newdrogstone.recursos;

import com.airton.newdrogstone.entidades.Cliente;
import com.airton.newdrogstone.service.ClienteService;
import com.airton.newdrogstone.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteRecurso {

    @Autowired
    private ClienteService service;

    @GetMapping
    public ResponseEntity<List<Cliente>> listar(){
        List<Cliente> obj = service.listarTodos();
        return ResponseEntity.ok().body(obj);
    }

}
