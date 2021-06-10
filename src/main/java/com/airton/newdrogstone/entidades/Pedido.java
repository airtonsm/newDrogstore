package com.airton.newdrogstone.entidades;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "tb_pedido")
public class Pedido implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Instant data;

    @ManyToOne
    @JoinColumn(name = "usuario_id") // nome da chave estrágeira(fk) na tabela pedido
    private Usuario usuario;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

   @OneToMany(mappedBy = "id.pedido") // é o id.pedido que possui qual pedido ira se relacionar com a collection de produtos
   private Set<PedidoProduto> produtos = new HashSet<>();

    public Pedido(){}

    public Pedido(Long id, Instant data, Usuario usuario, Cliente cliente) {
        this.id = id;
        this.data = data;
        this.usuario = usuario;
        this.cliente = cliente;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getData() {
        return data;
    }

    public void setData(Instant data) {
        this.data = data;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Set<PedidoProduto> getProdutos(){
        return produtos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pedido)) return false;
        Pedido pedido = (Pedido) o;
        return Objects.equals(getId(), pedido.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
