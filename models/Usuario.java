using System;
using System.Collections.Generic;

public abstract class Usuario
{
    public string Nome { get; set; }
    public string Email { get; set; }

    public abstract void EnviarEmail();
}

public class Jogador : Usuario
{
    public List<string> JogosComprados { get; set; }

    public Jogador(string nome, string email)
    {
        Nome = nome;
        Email = email;
        JogosComprados = new List<string>();
    }

    public override void EnviarEmail()
    {
        Console.WriteLine($"Enviando email para {Nome} ({Email})...");
    }

    public void CompraJogo(string jogo)
    {
        JogosComprados.Add(jogo);
        Console.WriteLine($"{Nome} comprou o jogo: {jogo}");
    }

    public void CompraCredito(bool valor)
    {
        // Lógica para compra de crédito
        if (valor)
        {
            Console.WriteLine($"{Nome} comprou crédito.");
        }
        else
        {
            Console.WriteLine("Compra de crédito falhou.");
        }
    }
}

public class Desenvolvedor : Usuario
{
    public List<string> JogosPublicados { get; set; }

    public Desenvolvedor(string nome, string email)
    {
        Nome = nome;
        Email = email;
        JogosPublicados = new List<string>();
    }

    public override void EnviarEmail()
    {
       
        Console.WriteLine($"Enviando email para {Nome} ({Email})...");
    }

    public void PublicarJogo(string jogo)
    {
        JogosPublicados.Add(jogo);
        Console.WriteLine($"{Nome} publicou o jogo: {jogo}");
    }
}

class Program
{
    static void Main(string[] args)
    {
        
        Jogador jogador = new Jogador("João", "joao@example.com");
        jogador.CompraJogo("Super Mario");
        jogador.CompraCredito(true);

        Desenvolvedor desenvolvedor = new Desenvolvedor("Maria", "maria@example.com");
        desenvolvedor.PublicarJogo("Call of Duty");
    }
}
