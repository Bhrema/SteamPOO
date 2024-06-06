package com.example.demo.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Desenvolvedor extends Usuario {

    @ElementCollection
    private List<String> jogosPublicados;

    public Desenvolvedor(String nome, String email, String password, CarrinhoDeCompras carrinho, Biblioteca biblioteca) {
        super(nome, email, password, carrinho, biblioteca);
        this.jogosPublicados = new ArrayList<>();
    }

// getters e setters
}
