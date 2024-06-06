package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class mainController {

    @GetMapping("/cadastro-usuario")
    public String cadastroUsuario() {
        return "cadastro-usuario.html";
    }
}
