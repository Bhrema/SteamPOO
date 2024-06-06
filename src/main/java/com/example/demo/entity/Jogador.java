package com.example.demo.entity;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Jogador extends Usuario {

    @ElementCollection
    private List<String> jogosComprados;

    public Jogador(String nome, String email, String password, CarrinhoDeCompras carrinho, Biblioteca biblioteca) {
        super(nome, email, password, carrinho, biblioteca);
        this.jogosComprados = new ArrayList<>();

    }

    // getters e setters
}
