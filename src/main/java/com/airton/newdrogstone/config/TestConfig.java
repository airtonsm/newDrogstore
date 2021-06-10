package com.airton.newdrogstone.config;

import com.airton.newdrogstone.entidades.*;
import com.airton.newdrogstone.repositorios.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

    @Autowired
    private ClienteRepositorio clienteRepositorio;

    @Autowired
    private PedidoRepositorio pedidoRepositorio;

    @Autowired
    private CategoriaRepositorio categoriaRepositorio;

    @Autowired
    private ProdutoRepositorio produtoRepositorio;

    @Override
    public void run(String... args) throws Exception {

        CategoriaProduto cp1 = new CategoriaProduto(null, "Marca");
        CategoriaProduto cp2 = new CategoriaProduto(null, "Genérico");
        CategoriaProduto cp3 = new CategoriaProduto(null, "Similar");

        categoriaRepositorio.saveAll((Arrays.asList(cp1,cp2,cp3)));

        Produto pd1 = new Produto(null, "Aspirina", "ASPIRINA 500MG COM 10 COMPRIMIDOS", 8.23);
        Produto pd2 = new Produto(null, "Buscopan", "Buscopan Composto 20 Comprimidos Revestidos", 14.40);
        Produto pd3 = new Produto(null, "Tylenol", "TYLENOL 750MG COM 20 COMPRIMIDOS", 30.28);

        produtoRepositorio.saveAll((Arrays.asList(pd1,pd2,pd3)));


        Usuario u1 = new Usuario(null, "José Airton", "Admnistrador", "airton", "12345");
        Usuario u2 = new Usuario(null, "Augusto Marcos", "Vendedor", "marcos", "12345");
        Usuario u3 = new Usuario(null, "Jonas Filipe", "Estoque", "jonas", "12345");

        usuarioRepositorio.saveAll((Arrays.asList(u1,u2,u3)));

        Cliente c1 = new Cliente(null, "Lucas José", "12345678901", "lucas@gmail.com", "6190873456");
        Cliente c2 = new Cliente(null, "Felipe Green", "23423423434", "felipe@gmail.com", "6112546798");
        Cliente c3 = new Cliente(null, "Ana Maria", "1232424234", "ana@gmail.com", "6188765432");

        clienteRepositorio.saveAll((Arrays.asList(c1,c2,c3)));

        Pedido p1 = new Pedido(null, Instant.parse("2019-06-20T19:53:07Z"), u1, c2);
        Pedido p2 = new Pedido(null, Instant.parse("2019-07-21T03:42:10Z"), u3, c1);
        Pedido p3 = new Pedido(null, Instant.parse("2019-07-22T15:21:22Z"), u2, c3);

        pedidoRepositorio.saveAll((Arrays.asList(p1,p2,p3)));

    }
}
