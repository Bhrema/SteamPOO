package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Biblioteca;
import com.example.demo.repository.BibliotecaRepository;

@Service
public class BibliotecaService {

    @Autowired
    private BibliotecaRepository bibliotecaRepository;

    public Biblioteca save(Biblioteca biblioteca) {
        return bibliotecaRepository.save(biblioteca);
    }

    public Optional<Biblioteca> findById(Long id) {
        return bibliotecaRepository.findById(id);
    }

    public List<Biblioteca> findAll() {
        return bibliotecaRepository.findAll();
    }

    public void deleteById(Long id) {
        bibliotecaRepository.deleteById(id);
    }
}
