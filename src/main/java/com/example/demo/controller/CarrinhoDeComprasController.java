package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.CarrinhoDeCompras;
import com.example.demo.entity.Jogo;
import com.example.demo.service.CarrinhoDeComprasService;

@RestController
@RequestMapping("/carrinho")
public class CarrinhoDeComprasController {

    @Autowired
    private CarrinhoDeComprasService carrinhoDeComprasService;

    @PostMapping
    public CarrinhoDeCompras addCarrinho(@RequestBody CarrinhoDeCompras carrinho) {
        return carrinhoDeComprasService.save(carrinho);
    }

    @GetMapping("/{id}")
    public CarrinhoDeCompras getCarrinho(@PathVariable Long id) {
        return carrinhoDeComprasService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteCarrinho(@PathVariable Long id) {
        carrinhoDeComprasService.deleteById(id);
    }

    @PostMapping("/{id}/add-jogo")
    public CarrinhoDeCompras addJogo(@PathVariable Long id, @RequestBody Jogo jogo) {
        CarrinhoDeCompras carrinho = carrinhoDeComprasService.findById(id);
        if (carrinho != null) {
            carrinho.adicionarProduto(jogo);
            return carrinhoDeComprasService.save(carrinho);
        }
        return null;
    }
}
