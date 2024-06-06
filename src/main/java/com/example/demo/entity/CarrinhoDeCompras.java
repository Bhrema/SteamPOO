package com.example.demo.entity;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class CarrinhoDeCompras {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Jogo> jogos;

    // getters e setters
}
