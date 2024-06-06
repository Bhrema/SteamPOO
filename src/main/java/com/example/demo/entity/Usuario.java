package com.example.demo.entity;

import jakarta.persistence.*;


@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String nome;
    @Column
    private String email;
    @Column
    private String password;

    @OneToOne(cascade = CascadeType.ALL)
    protected CarrinhoDeCompras carrinho;

    @OneToOne(cascade = CascadeType.ALL)
    protected Biblioteca biblioteca;

    public Usuario(String nome, String email, String password, CarrinhoDeCompras carrinho, Biblioteca biblioteca) {
        this.nome = nome;
        this.email = email;
        this.password = password;
        this.carrinho = carrinho;
        this.biblioteca = biblioteca;
    }


    // getters e setters
}
