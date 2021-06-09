package com.airton.newdrogstone.recursos;

import com.airton.newdrogstone.entidades.Produto;
import com.airton.newdrogstone.service.ProdutoService;
import com.airton.newdrogstone.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/produtos")
public class ProdutoRecurso {

    @Autowired
    private ProdutoService service;

    @GetMapping
    public ResponseEntity<List<Produto>> listar(){
        List<Produto> obj = service.listarTodos();
        return ResponseEntity.ok().body(obj);
    }
}
