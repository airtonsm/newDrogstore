package com.airton.newdrogstone.recursos;

import com.airton.newdrogstone.entidades.Usuario;
import com.airton.newdrogstone.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioRecurso {

    @Autowired
    private UsuarioService service;

    @GetMapping
    public ResponseEntity<List<Usuario>> listar(){
        List<Usuario> obj = service.listarTodos();
        return ResponseEntity.ok().body(obj);
    }
}
