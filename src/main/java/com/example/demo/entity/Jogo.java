package com.example.demo.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public abstract class Jogo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String titulo;

    @ManyToOne
    private Desenvolvedor desenvolvedor;

    private int ano;
    private double valor;

    @ElementCollection
    private List<String> categorias;

    public Jogo(String titulo, Desenvolvedor desenvolvedor, int ano, double valor, List<String> categorias) {
        this.titulo = titulo;
        this.desenvolvedor = desenvolvedor;
        this.ano = ano;
        this.valor = valor;
        this.categorias = categorias;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Desenvolvedor getDesenvolvedor() {
        return desenvolvedor;
    }

    public void setDesenvolvedor(Desenvolvedor desenvolvedor) {
        this.desenvolvedor = desenvolvedor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public List<String> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<String> categorias) {
        this.categorias = categorias;
    }

    abstract public void jogar();
}
