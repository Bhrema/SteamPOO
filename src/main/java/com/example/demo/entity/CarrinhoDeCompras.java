package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class CarrinhoDeCompras {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Jogo> jogos;

    public CarrinhoDeCompras() {
        this.jogos = new ArrayList<>();
    }

    public List<Jogo> getJogos() {
        return jogos;
    }

    public void setJogos(List<Jogo> jogos) {
        this.jogos = jogos;
    }

    public void adicionarProduto(Jogo jogo) {
        jogos.add(jogo);
    }

    public void removerProduto(Jogo jogo) {
        jogos.remove(jogo);
    }

    public double calcularTotal() {
        double total = 0;
        for (Jogo jogo : jogos) {
            total += jogo.getValor();
        }
        return total;
    }

    public void exibirProdutos() {
        System.out.println("Produtos no carrinho:");
        for (Jogo jogo : jogos) {
            System.out.println(jogo.getTitulo() + " - R$" + jogo.getValor());
        }
    }
}