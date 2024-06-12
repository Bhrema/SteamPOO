package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.CarrinhoDeCompras;
import com.example.demo.repository.CarrinhoDeComprasRepository;

@Service
public class CarrinhoDeComprasService {

    @Autowired
    private CarrinhoDeComprasRepository carrinhoDeComprasRepository;

    public CarrinhoDeCompras save(CarrinhoDeCompras carrinhoDeCompras) {
        return carrinhoDeComprasRepository.save(carrinhoDeCompras);
    }

    public CarrinhoDeCompras findById(Long id) {
        return carrinhoDeComprasRepository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        carrinhoDeComprasRepository.deleteById(id);
    }
}
