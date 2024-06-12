package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Biblioteca;
import com.example.demo.entity.Jogo;
import com.example.demo.service.BibliotecaService;

@RestController
@RequestMapping("/biblioteca")
public class BibliotecaController {

    @Autowired
    private BibliotecaService bibliotecaService;

    @PostMapping
    public Biblioteca addBiblioteca(@RequestBody Biblioteca biblioteca) {
        return bibliotecaService.save(biblioteca);
    }

    @GetMapping("/{id}")
    public Optional<Biblioteca> getBiblioteca(@PathVariable Long id) {
        return bibliotecaService.findById(id);
    }

    @GetMapping
    public List<Biblioteca> getAllBibliotecas() {
        return bibliotecaService.findAll();
    }

    @DeleteMapping("/{id}")
    public void deleteBiblioteca(@PathVariable Long id) {
        bibliotecaService.deleteById(id);
    }

    @PostMapping("/{id}/add-jogo")
    public Biblioteca addJogo(@PathVariable Long id, @RequestBody Jogo jogo) {
        Optional<Biblioteca> bibliotecaOpt = bibliotecaService.findById(id);
        if (bibliotecaOpt.isPresent()) {
            Biblioteca biblioteca = bibliotecaOpt.get();
            biblioteca.adicionarJogo(jogo);
            return bibliotecaService.save(biblioteca);
        }
        return null;
    }
}
