package com.example.demo.entity;

import com.example.demo.entity.Jogo;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Biblioteca {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Jogo> jogos;

    // getters e setters
}
