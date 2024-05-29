package org.example;

import org.json.JSONException;
import org.json.JSONObject;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws JSONException {
        // Criando um objeto JSON
        JSONObject pessoa = new JSONObject();
        pessoa.put("nome", "Alice");
        pessoa.put("idade", 30);

        // Caminho do arquivo
        String caminhoArquivo = "database.json";

        try (FileWriter arquivo = new FileWriter(caminhoArquivo)) {
            arquivo.write(pessoa.toString());
            System.out.println("Arquivo criado com sucesso: " + caminhoArquivo);
        } catch (IOException e) {
            System.err.println("Erro ao criar o arquivo: " + e.getMessage());
        }
    }
}