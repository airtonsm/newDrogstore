package com.airton.newdrogstone.entidades;

import com.airton.newdrogstone.entidades.PK.PedidoProdutoPK;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "tb_pedidoProduto")
public class PedidoProduto implements Serializable {

    @EmbeddedId
    private PedidoProdutoPK id = new PedidoProdutoPK();

    private Integer quantidade;
    private Double preço;

    public PedidoProduto(){}

    public PedidoProduto(Pedido pedido, Produto produto, Integer quantidade, Double preço) {
        id.setPedido(pedido);
        id.setProduto(produto);
        this.quantidade = quantidade;
        this.preço = preço;
    }

    @JsonIgnore
    public Pedido getPedido(){
        return  id.getPedido(); // retorna o id do pedido que foi instanciado no construtor
    }

    public void setPedido(Pedido pedido){
        id.setPedido(pedido);
    }

    public Produto getProduto(){
        return id.getProduto();
    }

    public void setProduto(Produto produto){
        id.setProduto(produto);
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPreço() {
        return preço;
    }

    public void setPreço(Double preço) {
        this.preço = preço;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PedidoProduto)) return false;
        PedidoProduto that = (PedidoProduto) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
