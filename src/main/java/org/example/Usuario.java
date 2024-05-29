package org.example;

import java.util.ArrayList;
import java.util.List;

abstract class Usuario {
    public String nome;
    public String email;

    abstract void enviarEmail();
}

class Jogador extends Usuario {
    List<String> jogosComprados;

    Jogador(String nome, String email) {
        this.nome = nome;
        this.email = email;
        jogosComprados = new ArrayList<>();
    }

    @Override
    void enviarEmail() {
        System.out.println("Enviando email para " + nome + " (" + email + ")...");
    }

    void compraJogo(String jogo) {
        jogosComprados.add(jogo);
        System.out.println(nome + " comprou o jogo: " + jogo);
    }

    void compraCredito(boolean valor) {
        // Lógica para compra de crédito
        if (valor) {
            System.out.println(nome + " comprou crédito.");
        } else {
            System.out.println("Compra de crédito falhou.");
        }
    }
}

class Desenvolvedor extends Usuario {
    List<String> jogosPublicados;

    Desenvolvedor(String nome, String email) {
        this.nome = nome;
        this.email = email;
        jogosPublicados = new ArrayList<>();
    }

    @Override
    void enviarEmail() {
        System.out.println("Enviando email para " + nome + " (" + email + ")...");
    }

    void publicarJogo(String jogo) {
        jogosPublicados.add(jogo);
        System.out.println(nome + " publicou o jogo: " + jogo);
    }
}
